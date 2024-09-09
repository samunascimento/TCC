with Conflict_Files as (
	select cf.id as cf_id, cf.conflictfiletype, m.id as merge_id, m.mergehash as merge_hash, cf.parent1filepath, cf.parent2filepath, cf.ancestorfilepath, cf.hasoutsidealterations, cf.outofmemory,
	m.numberofalterations as mergetotalalterations, m.error, p.name as project_name
	from conflictfile cf 
	join "merge" m on m.id = cf.mergeid  
	join analysis a on m.analysisid = a.id 
	join project p on a.projectid = p.id 
	group by cf.id, merge_id, project_name
),

NumDevelperDecisions as (
	select cf.id as cf_id, count (distinct c.id) FILTER (where c.developerdecision = 1) as dd_V1, count (distinct c.id) FILTER (where c.developerdecision = 2) as dd_V2,
	count (distinct c.id) FILTER (where c.developerdecision = 3) as dd_Concat, count (distinct c.id) FILTER (where c.developerdecision = 4) as dd_Comb,
	count (distinct c.id) FILTER (where c.developerdecision = 5) as dd_Newcode, count (distinct c.id) FILTER (where c.developerdecision = 6) as dd_None,
	count (distinct c.id) FILTER (where c.developerdecision = 7) as dd_Imprecise, count (distinct c.id) FILTER (where c.developerdecision = 8) as dd_FileDel,
	count (distinct c.id) FILTER (where c.developerdecision = 9) as dd_Post1, count (distinct c.id) FILTER (where c.developerdecision = 10) as dd_Post2,
	count (distinct c.id) FILTER (where c.developerdecision = 11) as dd_Post3, count (distinct c.id) FILTER (where c.developerdecision = 12) as dd_DiffProb
	from conflictfile cf 
	join "merge" m on m.id = cf.mergeid
	join analysis a on m.analysisid = a.id 
	join project p on a.projectid = p.id 
	join chunk c on cf.id = c.conflictfileid
	group by cf.id
),

NumOutsideAlterations as (
	select cf.id as cf_id, count (distinct a.id) as num_outside_alterations
	from conflictfile cf 
	join "merge" m on m.id = cf.mergeid  
	join fileoa f on f.conflictfileid = cf.id
	join alteration a on f.id = a.fileoaid
	group by cf.id
)


select 
cf.cf_id,
cf.merge_id,
cf.project_name,
cf.merge_hash as MergeHash,
cf.error,
cf.mergetotalalterations,
cf.conflictfiletype,
cf.parent1filepath, cf.parent2filepath, cf.ancestorfilepath, cf.hasoutsidealterations,
noa.num_outside_alterations,
cf.outofmemory,
	ndd.dd_V1, ndd.dd_V2, ndd.dd_Concat, ndd.dd_Comb, ndd.dd_Newcode, ndd.dd_None, ndd.dd_Imprecise, ndd.dd_FileDel,
	ndd.dd_Post1, ndd.dd_Post2, ndd.dd_Post3, ndd.dd_DiffProb
from 
	Conflict_Files cf
left join
	NumDevelperDecisions ndd on cf.cf_id = ndd.cf_id
left join
	NumOutsideAlterations noa on cf.cf_id = noa.cf_id
group by 
	cf.cf_id,
cf.merge_id,
cf.project_name,
cf.error,
cf.mergetotalalterations,
cf.conflictfiletype,
noa.num_outside_alterations,
cf.parent1filepath, cf.parent2filepath, cf.ancestorfilepath, cf.hasoutsidealterations, cf.outofmemory,
	cf.merge_hash,
	ndd.dd_V1, ndd.dd_V2, ndd.dd_Concat, ndd.dd_Comb, ndd.dd_Newcode, ndd.dd_None, ndd.dd_Imprecise, ndd.dd_FileDel,
	ndd.dd_Post1, ndd.dd_Post2, ndd.dd_Post3, ndd.dd_DiffProb
order by 
	cf.cf_id