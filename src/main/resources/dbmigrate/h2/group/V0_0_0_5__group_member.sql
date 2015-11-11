
CREATE TABLE GROUP_MEMBER(
        ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
	INFO_ID BIGINT,
	USER_ID VARCHAR(64),
	TENANT_ID VARCHAR(64),
        CONSTRAINT PK_GROUP_MEMBER PRIMARY KEY(ID),
        CONSTRAINT FK_GROUP_MEMBER_INFO FOREIGN KEY(INFO_ID) REFERENCES GROUP_INFO(ID)
);