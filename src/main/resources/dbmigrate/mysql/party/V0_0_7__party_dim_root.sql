
CREATE TABLE PARTY_DIM_ROOT(
	ID BIGINT,
	ENTITY_ID BIGINT,
	DIM_ID BIGINT,
	SCOPE_ID VARCHAR(50),
        CONSTRAINT PK_PARTY_DIM_ROOT PRIMARY KEY(ID),
        CONSTRAINT FK_PARTY_DIM_ROOT_ENTITY FOREIGN KEY(ENTITY_ID) REFERENCES PARTY_ENTITY(ID),
        CONSTRAINT FK_PARTY_DIM_ROOT_DIM FOREIGN KEY(DIM_ID) REFERENCES PARTY_DIM(ID)
) ENGINE=INNODB CHARSET=UTF8;
