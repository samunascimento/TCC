CREATE TABLE Project(
    id SERIAL, PRIMARY KEY (id),
    name VARCHAR(100),
    url VARCHAR(250),
    organization VARCHAR(100)
);

CREATE TABLE Analysis(
	id SERIAL, PRIMARY KEY (id),
	saveDate TIMESTAMP,
	codeVersion VARCHAR(10),
	completed BOOLEAN
);

CREATE TABLE Project_Analysis(
	projectFK INT, FOREIGN KEY(projectFK) REFERENCES Project(id) ON DELETE SET NULL ON UPDATE CASCADE,
	analysisFK INT, FOREIGN KEY (analysisFK) REFERENCES Analysis(id) ON DELETE SET NULL ON UPDATE CASCADE,
	CONSTRAINT projectAnalysisKey PRIMARY KEY (projectFK, analysisFK)
);

CREATE TABLE Commit(
	id SERIAL, PRIMARY KEY (id),
	message VARCHAR(5000),
	commitHash VARCHAR(50),
	author VARCHAR(100),
 	authorDate BIGINT,
 	committer VARCHAR(100),
 	committerDate BIGINT
);

CREATE TABLE Merge(
	id SERIAL, PRIMARY KEY (id),
	mergeType INT,
	mergeCommitFK INT, FOREIGN KEY(mergeCommitFK) REFERENCES Commit(id) ON DELETE SET NULL ON UPDATE CASCADE,
	mergeBaseFK INT, FOREIGN KEY(mergeBaseFK) REFERENCES Commit(id) ON DELETE SET NULL ON UPDATE CASCADE
);

CREATE TABLE Merge_Commit_parents(
	mergeFK INT, FOREIGN KEY(mergeFK) REFERENCES Merge(id) ON DELETE SET NULL ON UPDATE CASCADE,
	commitFK INT, FOREIGN KEY (commitFK) REFERENCES Commit(id) ON DELETE SET NULL ON UPDATE CASCADE,
	CONSTRAINT mergeCommitParentsKey PRIMARY KEY (mergeFK, commitFK)
);

CREATE TABLE Merge_Analysis(
	mergeFK INT, FOREIGN KEY(mergeFK) REFERENCES Merge(id) ON DELETE SET NULL ON UPDATE CASCADE,
	analysisFK INT, FOREIGN KEY (analysisFK) REFERENCES Analysis(id) ON DELETE SET NULL ON UPDATE CASCADE,
	hasOutOfMemory BOOLEAN,
	completed BOOLEAN,
	CONSTRAINT mergeAnalysisKey PRIMARY KEY (mergeFK, analysisFK)
);

CREATE TABLE Project_Merge(
	projectFK INT, FOREIGN KEY(projectFK) REFERENCES Project(id) ON DELETE SET NULL ON UPDATE CASCADE,
	mergeFK INT, FOREIGN KEY(mergeFK) REFERENCES Merge(id) ON DELETE SET NULL ON UPDATE CASCADE,
	mergeHash VARCHAR(50),
	CONSTRAINT projectMergeKey PRIMARY KEY (projectFK, mergeFK)
);

CREATE TABLE ConflictFile(
	id SERIAL, PRIMARY KEY (id),
	parent1FilePath VARCHAR(500),
	parent2FilePath VARCHAR(500),
	ancestorFilePath VARCHAR(500),
	conflictFilePath INT,
	hasOutsideAlterations INT,
	outOfMemory BOOLEAN,
	conflictFileType INT
);

CREATE TABLE Merge_ConflictFile_Analysis(
	mergeFK INT, FOREIGN KEY(mergeFK) REFERENCES Merge(id) ON DELETE SET NULL ON UPDATE CASCADE,
	conflictFileFK INT, FOREIGN KEY(conflictFileFK) REFERENCES ConflictFile(id) ON DELETE SET NULL ON UPDATE CASCADE,
	analysisFK INT, FOREIGN KEY (analysisFK) REFERENCES Analysis(id) ON DELETE SET NULL ON UPDATE CASCADE,
	completed BOOLEAN,
	CONSTRAINT mergeConflictFileAnalysisKey PRIMARY KEY (mergeFK, conflictFileFK, analysisFK)
);

CREATE TABLE Chunk(
	id SERIAL, PRIMARY KEY (id),
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

CREATE TABLE ConflictFile_Chunk_Analysis(
	conflictFileFK INT, FOREIGN KEY(conflictFileFK) REFERENCES ConflictFile(id) ON DELETE SET NULL ON UPDATE CASCADE,
	chunkFK INT, FOREIGN KEY(chunkFK) REFERENCES Chunk(id) ON DELETE SET NULL ON UPDATE CASCADE,
	analysisFK INT, FOREIGN KEY (analysisFK) REFERENCES Analysis(id) ON DELETE SET NULL ON UPDATE CASCADE,
	CONSTRAINT conflictFileChunkAnalysisKey PRIMARY KEY (conflictFileFK, chunkFK, analysisFK)
);


