create table Project(
   	id SERIAL PRIMARY KEY (ID),
    name VARCHAR(100),
    url VARCHAR(300),
    organization VARCHAR(100),
    PRIMARY KEY (ID)
);

create table Merge(
	id SERIAL PRIMARY KEY (ID),
	fk_ancestor FOREIGN KEY,
	fk_merge FOREIGN KEY NOT NULL,
	mergeType INT,
);

CREATE TABLE Commit(
	id SERIAL PRIMARY KEY (ID),
	message VARCHAR(100),
	commitHash VARCHAR(20),
	author VARCHAR(100),
 	authorDate DATE,
 	committer VARCHAR(100),
 	committerDate DATE,
	PRIMARY KEY (ID)
);

CREATE TABLE Conflict(
	id SERIAL PRIMARY KEY (ID),
	parent1FilePath VARCHAR(500),
	parent2FilePath VARCHAR(500),
	ancestorFilePath VARCHAR(500),
	hasOutsideAlterations BOOLEAN,
	hasOutsideAlterationsIgnoringFormatting BOOLEAN,
	conflictType INT,
	PRIMARY KEY (ID)
);

CREATE TABLE ConflictRegion(
	id SERIAL PRIMARY KEY (ID),
	rawConflict TEXT,
	beforeContext TEXT,
	beginLine INT,
	v1Text TEXT,
	separatorLine INT,
	v2Text TEXT,
	endLine INT,
	solutionText TEXT,
	structures TEXT,
	outmostedStructures TEXT,
	originalV1FirstLine INT,
	originalV2FirstLine INT,
	developerDecision INT,
);

CREATE TABLE Project_Merge(
	idProject INT PRIMARY KEY, FOREIGN KEY(idProject) REFERENCES Project(id),
	idMerge INT PRIMARY KEY, FOREIGN KEY (idMerge) REFERENCES Merge(id),
	CONSTRAINT project_merge_Key PRIMARY KEY (idProject, idMerge)
);

CREATE TABLE Merge_Commit_parents(
	idMerge INT PRIMARY KEY, FOREIGN KEY(idMerge) REFERENCES Merge(id),
	idCommit INT PRIMARY KEY, FOREIGN KEY (idCommit) REFERENCES Commit(id),
	CONSTRAINT merge_commit_parents_key PRIMARY KEY (idMerge, idCommit)
);

CREATE TABLE Merge_Conflict(
	idMerge INT PRIMARY KEY, FOREIGN KEY(idMerge) REFERENCES Merge(id),
	idConflict INT PRIMARY KEY, FOREIGN KEY (idConflict) REFERENCES Conflict(id),
	CONSTRAINT merge_conflict_key PRIMARY KEY (idMerge, idConflict)
);

CREATE TABLE Conflict_ConflictRegion(
	idConflict INT PRIMARY KEY, FOREIGN KEY (idConflict) REFERENCES Conflict(id),
	idConflictRegion INT PRIMARY KEY, FOREIGN KEY (idConflictRegion) REFERENCES ConflictRegion(id),
	CONSTRAINT conflict_conflictRegion_key PRIMARY KEY (idConflict, idConflictRegion)
);