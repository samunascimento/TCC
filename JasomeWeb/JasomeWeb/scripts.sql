-- BUSCAR PROJETOS DO BANCO
select a.id, a.projectname 
from tb_projectmetrics as a
where a.projectname = 'minecrowdcontrol'


-- METRICA TLOC DE VERSÃO DE UM DADO PROJETO X

select a.id,a.projectname ,b.version_id,c.id,d.id,d.name,d.description,d.value
from tb_projectmetrics as a
inner join tb_project_version as b
on a.id = b.project_id
inner join tb_versionmetrics as c
on b.version_id = c.id
inner join tb_metric  as d
on c.tlocid = d.id
where a.id = 1

-- METRICA TLOC DE PACOTE DA VERSÃO Y E DO PROJETO X

select a.id,a.projectname,b.project_id,b.version_id,c.package_id,d.id,e.id,e.name,e.description,e.value
from tb_projectmetrics as a
inner join tb_project_version as b
on a.id = b.project_id
inner join tb_version_package as c
on b.version_id = c.version_id
inner join tb_packagemetrics as d
on c.package_id = d.id
inner join tb_metric as e
on d.tlocid = e.id
where a.projectname = 'minecrowdcontrol'