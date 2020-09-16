create table SyntaxStructure(
	id serial not null,
	startLine int,
	stopLine int,
	startCharIndex int,
	stopCharIndex int,
	structureType  varchar(50),
	textContent text,
	warning boolean,
	PRIMARY KEY (ID)

);

create table ConflictRegion(
	id serial not null,
  rawText text ,
	afterContext text ,
  beforeContext text,
  v1 text,
  v2 text,
  v1Size int,
  v2Size int, 	
  solution text,
  beginLine int,
  separatorLine int,
  endLine int,
  originalV1StartLine int,
  originalV1StopLine int,
  originalV2StartLine int,
  originalV2StopLine int,
  typesOfConflicts text,
  outmostedTypesOfConflicts text,

	PRIMARY KEY (ID)

);

create table SyntaxStructure_ConflictRegion_syntaxV1(
	idSyntaxStructure int,
	idConflictRegion int,
	FOREIGN KEY	(idSyntaxStructure) REFERENCES SyntaxStructure(id),
	FOREIGN KEY (idConflictRegion) REFERENCES ConflictRegion(id)
);


create table SyntaxStructure_ConflictRegion_syntaxV2(
	idSyntaxStructure int,
	idConflictRegion int,
	FOREIGN KEY	(idSyntaxStructure) REFERENCES SyntaxStructure(id),
	FOREIGN KEY (idConflictRegion) REFERENCES ConflictRegion(id)
);


create table SyntaxStructure_ConflictRegion_outmostedSyntaxV1(
	idSyntaxStructure int,
	idConflictRegion int,
	FOREIGN KEY	(idSyntaxStructure) REFERENCES SyntaxStructure(id),
	FOREIGN KEY (idConflictRegion) REFERENCES ConflictRegion(id)
);

create table SyntaxStructure_ConflictRegion_outmostedSyntaxV2(
	idSyntaxStructure int,
	idConflictRegion int,
	FOREIGN KEY	(idSyntaxStructure) REFERENCES SyntaxStructure(id),
	FOREIGN KEY (idConflictRegion) REFERENCES ConflictRegion(id)
);

create table DeveloperDecision(
 name varchar(15)
);


create table ConflictFile(
  id serial not null,
  fileName text,
  filePath text,
  insideFilePath text,
  extraFileName text,
  extraFilePath text,
  extraInsideFilePath text,
  PRIMARY KEY (ID)

);

create table ConflictRegion_ConflictFile(
	idConflictFile int,
	idConflictRegion int,
	FOREIGN KEY	(idConflictFile) REFERENCES ConflictFile(id),
	FOREIGN KEY	(idConflictRegion) REFERENCES ConflictRegion(id)
);

create table MergeEvent(
id serial not null,
isConflict boolean,
PRIMARY KEY (ID)
);


create table ConflictFile_MergeEvent(
	idConflictFile int,
	idMergeEvent int,
	FOREIGN KEY	(idConflictFile) REFERENCES ConflictFile(id),
	FOREIGN KEY	(idMergeEvent) REFERENCES MergeEvent(id)
);


create table CommitData(
 id serial not null,
 commitHash text,
 author text,
 authorDate date,
 committer text,
 committerDate date,
 title text,
 PRIMARY KEY (ID)
);

create table CommitData_MergeEvent_Hash(
	idCommitData int,
	idMergeEvent int,
	FOREIGN KEY	(idCommitData) REFERENCES CommitData(id),
	FOREIGN KEY	(idMergeEvent) REFERENCES MergeEvent(id)
);

create table CommitData_MergeEvent_parents(
	idCommitData int,
	idMergeEvent int,
	FOREIGN KEY	(idCommitData) REFERENCES CommitData(id),
	FOREIGN KEY	(idMergeEvent) REFERENCES MergeEvent(id)
);

create table CommitData_MergeEvent_commonAncestorOfParents(
	idCommitData int,
	idMergeEvent int,
	FOREIGN KEY	(idCommitData) REFERENCES CommitData(id),
	FOREIGN KEY	(idMergeEvent) REFERENCES MergeEvent(id)
);
