DROP SCHEMA public CASCADE;
CREATE SCHEMA public;

CREATE TABLE Project(
    id SERIAL, PRIMARY KEY (id),
    name VARCHAR(100),
    url VARCHAR(250),
    organization VARCHAR(100)
);

CREATE TABLE Analysis(
	id SERIAL, PRIMARY KEY (id),
	projectId INT, FOREIGN KEY(projectId) REFERENCES Project(id) ON DELETE CASCADE ON UPDATE CASCADE,
	startTime TIMESTAMP,
	codeVersion VARCHAR(10),
	completed BOOLEAN
);

CREATE TABLE Merge(
	id SERIAL, PRIMARY KEY (id),
	analysisId INT, FOREIGN KEY(analysisId) REFERENCES Analysis(id) ON DELETE CASCADE ON UPDATE CASCADE,
	mergeHash VARCHAR(50), 
	mergeType INT,
	numberOfAlterations INT,
	completed BOOLEAN,
	error TEXT
);

CREATE TABLE Commit(
	id SERIAL, PRIMARY KEY (id),
	mergeId INT, FOREIGN KEY(mergeId) REFERENCES Merge(id) ON DELETE CASCADE ON UPDATE CASCADE,
	message VARCHAR(5000),
	commitHash VARCHAR(50),
	author VARCHAR(100),
 	authorDate BIGINT,
 	committer VARCHAR(100),
 	committerDate BIGINT,
	type INT
);

CREATE TABLE ConflictFile(
	id SERIAL, PRIMARY KEY (id),
	mergeId INT, FOREIGN KEY(mergeId) REFERENCES Merge(id) ON DELETE CASCADE ON UPDATE CASCADE,
	parent1FilePath VARCHAR(500),
	parent2FilePath VARCHAR(500),
	ancestorFilePath VARCHAR(500),
	conflictFilePath INT,
	hasOutsideAlterations INT,
	outOfMemory BOOLEAN,
	conflictFileType INT
);

CREATE TABLE FileOA(
	id SERIAL, PRIMARY KEY (id),
	mergeId INT, FOREIGN KEY(mergeId) REFERENCES Merge(id) ON DELETE CASCADE ON UPDATE CASCADE,
	conflictFileId INT, FOREIGN KEY(conflictFileId) REFERENCES ConflictFile(id) ON DELETE CASCADE ON UPDATE CASCADE,
	filePath VARCHAR(500)
);

CREATE TABLE Alteration(
	id SERIAL, PRIMARY KEY (id),
	fileOAId INT, FOREIGN KEY(fileOAId) REFERENCES FileOA(id) ON DELETE CASCADE ON UPDATE CASCADE,
	content TEXT,
	isAddition BOOLEAN,
	wasInsideChunk BOOLEAN
);

CREATE TABLE Chunk(
	id SERIAL, PRIMARY KEY (id),
	conflictFileId INT, FOREIGN KEY(conflictFileId) REFERENCES ConflictFile(id) ON DELETE CASCADE ON UPDATE CASCADE,
	chunkText TEXT,
	firstPrefixLine INT,
	beginLine INT,
	separatorLine INT,
	endLine INT,
	lastSuffixLine INT,
	solutionText TEXT,
	languageConstructs TEXT,
	originalV1FirstLine INT,
	originalV2FirstLine INT,
	developerDecision INT
);
