with Merges as (
	select m.id as merge_id, p.main_language, m.mergetype as merge_type, m.mergehash as merge_hash,
	m.numberofalterations as merge_alterations, m.error, p.name as project_name 
	from "merge" m 
	join analysis a on m.analysisid = a.id 
	join project p on a.projectid = p.id 
	group by merge_id, project_name, p.main_language
),

NumConflictFileTypes as (
	select m.id as merge_id, count (distinct c.id) as conflict_files, count (distinct m.id) FILTER (where c.conflictfiletype = 1) as cft_content, count (distinct m.id) FILTER (where c.conflictfiletype = 2) as cft_coincidentadd,
	count (distinct m.id) FILTER (where c.conflictfiletype = 3) as cft_filerename, count (distinct m.id) FILTER (where c.conflictfiletype = 4) as cft_dirrename,
	count (distinct m.id) FILTER (where c.conflictfiletype = 5) as cft_moddelete, count (distinct m.id) FILTER (where c.conflictfiletype = 6) as cft_renamedelete,
	count (distinct m.id) FILTER (where c.conflictfiletype = 7) as cft_p1p2add, count (distinct m.id) FILTER (where c.conflictfiletype = 8) as cft_p2p1add,
	count (distinct m.id) FILTER (where c.conflictfiletype = 9) as cft_filelocation, count (distinct m.id) FILTER (where c.conflictfiletype = 10) as cft_submodule,
	count (distinct m.id) FILTER (where c.conflictfiletype = 11) as cft_contentuniremaning, count (distinct m.id) FILTER (where c.conflictfiletype = 12) as cft_dirrensplit
	from "merge" m
	join conflictfile c on m.id = c.mergeid
	group by merge_id
),

NumDevelperDecisions as (
	select m.id as merge_id, count (distinct c.id) FILTER (where c.developerdecision = 1) as dd_V1, count (distinct c.id) FILTER (where c.developerdecision = 2) as dd_V2,
	count (distinct c.id) FILTER (where c.developerdecision = 3) as dd_Concat, count (distinct c.id) FILTER (where c.developerdecision = 4) as dd_Comb,
	count (distinct c.id) FILTER (where c.developerdecision = 5) as dd_Newcode, count (distinct c.id) FILTER (where c.developerdecision = 6) as dd_None,
	count (distinct c.id) FILTER (where c.developerdecision = 7) as dd_Imprecise, count (distinct c.id) FILTER (where c.developerdecision = 8) as dd_FileDel,
	count (distinct c.id) FILTER (where c.developerdecision = 9) as dd_Post1, count (distinct c.id) FILTER (where c.developerdecision = 10) as dd_Post2,
	count (distinct c.id) FILTER (where c.developerdecision = 11) as dd_Post3, count (distinct c.id) FILTER (where c.developerdecision = 12) as dd_DiffProb
	from "merge" m 
	join conflictfile cf on m.id = cf.mergeid
	join analysis a on m.analysisid = a.id 
	join project p on a.projectid = p.id 
	join chunk c on cf.id = c.conflictfileid
	group by merge_id
),

ExternalAlterationsWithoutConflict as (
	select m.id as merge_id, count(distinct a.id) as external_alterations_without_conflict
	from "merge" m 
	join fileoa f on m.id = f.mergeid 
	join alteration a on f.id = a.fileoaid 
	where not exists (
		select 1 from ConflictFile c
		where f.conflictfileid = c.id 
	)
	group by m.id 
),


ExternalAlterationsConflict as (
	select m.id as merge_id, count(distinct a.id) as external_alterations_with_conflict
	from "merge" m 
	join fileoa f on m.id = f.mergeid 
	join alteration a on f.id = a.fileoaid
	where exists (
		select 1 from ConflictFile c
		where f.conflictfileid = c.id 
	)  
	group by m.id 
),


InternalAlterations as (
	select m.id as merge_id, coalesce(m.numberofalterations, 0) - count(distinct a.id) as internal_alterations 
	from "merge" m 
	left join fileoa f on m.id = f.mergeid 
	left join alteration a on f.id = a.fileoaid
	group by m.id 
)


select 
m.merge_id,
m.project_name,
m.main_language,
m.merge_hash as MergeHash,
m.error,
m.merge_type as "Type",
m.merge_alterations as "Alterações Totais",
coalesce (eawc.external_alterations_without_conflict, 0) as "Alterações Externas(Arquivos sem conflito)",
coalesce (eac.external_alterations_with_conflict, 0) as "Alterações Externas(Arquivos com conflito)",
coalesce (ia.internal_alterations, 0) as "Alterações Internas",
ncf.conflict_files , ncf.cft_content, ncf.cft_coincidentadd, ncf.cft_filerename, ncf.cft_dirrename, ncf.cft_moddelete,
ncf.cft_renamedelete, ncf.cft_p1p2add, ncf.cft_p2p1add, ncf.cft_filelocation,
ncf.cft_submodule, ncf.cft_contentuniremaning, ncf.cft_dirrensplit,
ndd.dd_V1, ndd.dd_V2, ndd.dd_Concat, ndd.dd_Comb, ndd.dd_Newcode, ndd.dd_None, ndd.dd_Imprecise, ndd.dd_FileDel,
ndd.dd_Post1, ndd.dd_Post2, ndd.dd_Post3, ndd.dd_DiffProb
from 
	Merges m
left join
	ExternalAlterationsWithoutConflict eawc on m.merge_id = eawc.merge_id
left join 
	ExternalAlterationsConflict eac on m.merge_id = eac.merge_id
left join 
	InternalAlterations ia on m.merge_id = ia.merge_id
left join
	NumDevelperDecisions ndd on m.merge_id = ndd.merge_id
left join
	NumConflictFileTypes ncf on m.merge_id = ncf.merge_id
group by 
m.merge_id,
m.project_name,
m.main_language,
m.merge_hash,
m.error,
m.merge_type,
m.merge_alterations,
eawc.external_alterations_without_conflict,
eac.external_alterations_with_conflict,
ia.internal_alterations,
ncf.conflict_files , ncf.cft_content, ncf.cft_coincidentadd, ncf.cft_filerename, ncf.cft_dirrename, ncf.cft_moddelete,
ncf.cft_renamedelete, ncf.cft_p1p2add, ncf.cft_p2p1add, ncf.cft_filelocation,
ncf.cft_submodule, ncf.cft_contentuniremaning, ncf.cft_dirrensplit,
ndd.dd_V1, ndd.dd_V2, ndd.dd_Concat, ndd.dd_Comb, ndd.dd_Newcode, ndd.dd_None, ndd.dd_Imprecise, ndd.dd_FileDel,
ndd.dd_Post1, ndd.dd_Post2, ndd.dd_Post3, ndd.dd_DiffProb
order by 
	m.merge_id