
CREATE TABLE BPM_TASK_DEF(
	ID BIGINT AUTO_INCREMENT,
	TASK_DEFINITION_KEY VARCHAR(200),
	ASSIGNEE VARCHAR(200),
	CANDIDATE VARCHAR(200),
	PROCESS_ID BIGINT,
        CONSTRAINT PK_BPM_TASK_DEF PRIMARY KEY(ID),
        CONSTRAINT FK_BPM_TASK_DEF_ID FOREIGN KEY(PROCESS_ID) REFERENCES BPM_PROCESS(ID)
) ENGINE=INNODB CHARSET=UTF8;

