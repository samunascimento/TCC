WITH ProjectMerges AS (
    SELECT p.id AS project_id, p.name AS project_name, p.main_language, COUNT(DISTINCT m.id) AS total_merges
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN Merge m ON a.id = m.analysisId
    GROUP BY p.id
),

ProjectConflictMerges AS (
    SELECT p.id AS project_id, COUNT(DISTINCT m.id) AS conflict_merges
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN Merge m ON a.id = m.analysisId
    JOIN ConflictFile cf ON m.id = cf.mergeId
    GROUP BY p.id
),

MergesInConflictWithoutAlterations AS (
    SELECT p.id AS project_id, COUNT(DISTINCT m.id) AS conflict_without_alterations
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN Merge m ON a.id = m.analysisId
    JOIN ConflictFile cf ON m.id = cf.mergeId
    WHERE m.numberOfAlterations = 0
    GROUP BY p.id
),

MergesInConflictWithExternalAlterations AS (
    SELECT p.id AS project_id, COUNT(DISTINCT m.id) AS conflict_external_alterations
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN "merge" m ON a.id = m.analysisId
    join fileoa f on m.id = f.mergeid 
    WHERE EXISTS (
        SELECT 1 FROM Alteration alt
        WHERE alt.fileOAId = f.id 
    )
    GROUP BY p.id
),


MergesInConflictWithInternalAlterations AS (

 	SELECT
        p.id AS project_id,
        COALESCE(pcm.conflict_merges, 0) - COALESCE(micwoa.conflict_without_alterations, 0) - COALESCE(micwea.conflict_external_alterations, 0) AS conflict_internal_alterations
        
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN Merge m ON a.id = m.analysisId
    JOIN ConflictFile cf ON m.id = cf.mergeId
    join fileoa f on m.id = f.mergeid 
    LEFT JOIN ProjectConflictMerges pcm ON p.id = pcm.project_id
    LEFT JOIN
    MergesInConflictWithoutAlterations micwoa ON pcm.project_id = micwoa.project_id
	LEFT JOIN
    MergesInConflictWithExternalAlterations micwea ON pcm.project_id = micwea.project_id
    WHERE EXISTS (
        SELECT 1 FROM Alteration alt
        WHERE alt.fileOAId = f.id
    )
    GROUP BY p.id, pcm.conflict_merges, micwoa.conflict_without_alterations, micwea.conflict_external_alterations
),


MergesWithFilesInConflict AS (
    SELECT p.id AS project_id, COUNT(DISTINCT m.id) AS conflict_files
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN Merge m ON a.id = m.analysisId
    JOIN ConflictFile cf ON m.id = cf.mergeId
    join fileoa f on m.id = f.mergeid 
    WHERE EXISTS (
        SELECT 1 FROM Alteration alt
        WHERE alt.fileOAId = f.id AND alt.wasInsideChunk = TRUE
    )
    GROUP BY p.id
),

MergesWithFilesWithoutConflict AS (
    SELECT p.id AS project_id, COUNT(DISTINCT m.id) AS no_conflict_files
    FROM Project p
    JOIN Analysis a ON p.id = a.projectId
    JOIN Merge m ON a.id = m.analysisId
    JOIN ConflictFile cf ON m.id = cf.mergeId
    join fileoa f on m.id = f.mergeid 
    WHERE NOT EXISTS (
        SELECT 1 FROM Alteration alt
        WHERE alt.fileOAId = f.id AND alt.wasInsideChunk = TRUE
    )
    AND EXISTS (
        SELECT 1 FROM Alteration alt
        WHERE alt.fileOAId = f.id
    )
    GROUP BY p.id
)

SELECT
    pm.project_name AS Projeto,
	pm.main_language AS Linguagem,
    pm.total_merges AS Merges,
    COALESCE(pcm.conflict_merges, 0) AS "Merges em conflito",
    COALESCE(micwoa.conflict_without_alterations, 0) AS "Merges em conflito sem alterações",
    coalesce(micwia.conflict_internal_alterations, 0) as "Merges em conflito com alterações Internas",
    COALESCE(micwea.conflict_external_alterations, 0) AS "Merges em conflito com alterações Externas",
    COALESCE(mwic.conflict_files, 0) AS "Merges com Arquivos em conflito",
    COALESCE(mwiwo.no_conflict_files, 0) AS "Merges com Arquivos sem conflito"
FROM
    ProjectMerges pm
LEFT JOIN
    ProjectConflictMerges pcm ON pm.project_id = pcm.project_id
LEFT JOIN
    MergesInConflictWithoutAlterations micwoa ON pm.project_id = micwoa.project_id
left join 
	MergesInConflictWithInternalAlterations micwia on pm.project_id = micwia.project_id
LEFT JOIN
    MergesInConflictWithExternalAlterations micwea ON pm.project_id = micwea.project_id
LEFT JOIN
    MergesWithFilesInConflict mwic ON pm.project_id = mwic.project_id
LEFT JOIN
    MergesWithFilesWithoutConflict mwiwo ON pm.project_id = mwiwo.project_id
GROUP BY
    pm.project_id,
    pm.project_name,
	pm.main_language,
    pm.total_merges,
    pcm.conflict_merges,
    micwoa.conflict_without_alterations,
    micwia.conflict_internal_alterations,
    micwea.conflict_external_alterations,
    mwic.conflict_files,
    mwiwo.no_conflict_files
ORDER BY
    pm.project_name;