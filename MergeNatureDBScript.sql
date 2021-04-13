create table Project(
    id SERIAL, PRIMARY KEY (id),
    name VARCHAR(500),
    url VARCHAR(5000),
    organization VARCHAR(100)
);

CREATE TABLE Commit(
	id SERIAL, PRIMARY KEY (id),
	message VARCHAR(5000),
	commitHash VARCHAR(100),
	author VARCHAR(500),
 	authorDate BIGINT,
 	committer VARCHAR(500),
 	committerDate BIGINT
);

create table Merge(
	id SERIAL, PRIMARY KEY (id),
	mergeType INT,
	fk_merge INT,
	FOREIGN KEY(fk_merge) REFERENCES Commit(id),
	fk_ancestor INT, 
	FOREIGN KEY(fk_ancestor) REFERENCES Commit(id)
);

CREATE TABLE Conflict(
	id SERIAL, PRIMARY KEY (id),
	parent1FilePath VARCHAR(5000),
	parent2FilePath VARCHAR(5000),
	ancestorFilePath VARCHAR(5000),
	hasOutsideAlterations BOOLEAN,
	hasOutsideAlterationsIgnoringFormatting BOOLEAN,
	conflictType INT
);

CREATE TABLE ConflictRegion(
	id SERIAL, PRIMARY KEY (id),
	rawConflict TEXT,
	beforeContext TEXT,
	beginLine INT,
	v1Text TEXT,
	separatorLine INT,
	v2Text TEXT,
	endLine INT,
	afterContext TEXT,
	solutionText TEXT,
	structures TEXT,
	outmostedStructures TEXT,
	originalV1FirstLine INT,
	originalV2FirstLine INT,
	developerDecision INT
);

CREATE TABLE Project_Merge(
	idProject INT, FOREIGN KEY(idProject) REFERENCES Project(id),
	idMerge INT, FOREIGN KEY (idMerge) REFERENCES Merge(id),
	CONSTRAINT project_merge_Key PRIMARY KEY (idProject, idMerge)
);

CREATE TABLE Merge_Commit_parents(
	idMerge INT, FOREIGN KEY(idMerge) REFERENCES Merge(id),
	idCommit INT, FOREIGN KEY (idCommit) REFERENCES Commit(id),
	CONSTRAINT merge_commit_parents_key PRIMARY KEY (idMerge, idCommit)
);

CREATE TABLE Merge_Conflict(
	idMerge INT, FOREIGN KEY(idMerge) REFERENCES Merge(id),
	idConflict INT, FOREIGN KEY (idConflict) REFERENCES Conflict(id),
	CONSTRAINT merge_conflict_key PRIMARY KEY (idMerge, idConflict)
);

CREATE TABLE Conflict_ConflictRegion(
	idConflict INT, FOREIGN KEY (idConflict) REFERENCES Conflict(id),
	idConflictRegion INT, FOREIGN KEY (idConflictRegion) REFERENCES ConflictRegion(id),
	CONSTRAINT conflict_conflictRegion_key PRIMARY KEY (idConflict, idConflictRegion)
);