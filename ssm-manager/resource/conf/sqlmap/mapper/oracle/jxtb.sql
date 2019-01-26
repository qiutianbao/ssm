create table CBD_USER_LOGIN
(
  ID             NUMBER(18) not null,
  LOGIN_NAME     VARCHAR2(50) not null,
  LOGIN_PWD VARCHAR2(50) not null,
  USER_TYPE NUMBER(18),
  ROLE_ID NUMBER(18),
  IS_DELETE   NUMBER(18),
  TRY_NUM   NUMBER(18),
  START_DATE     DATE,
  END_DATE       DATE,
  CREATE_TIME    DATE,
  MODIFY_TIME     DATE,
  LOGIN_TIME    DATE,
  LAST_LOGIN_TIME    DATE
);

ALTER TABLE CBD_USER_LOGIN ADD CONSTRAINT PK_INFOS PRIMARY KEY(ID);

insert into CBD_USER_LOGIN
values(1,'admin','admin',1,1,0,0,null,null,null,null,null,null);
commit;


create table CBD_USER
(
  USER_ID             NUMBER(18) not null,
  USER_NAME     VARCHAR2(50),
  MOBILE_PHONE VARCHAR2(50) ,
  TEL_PHONE  VARCHAR2(50),
  EMAIL  VARCHAR2(50),
  DEPT_ID  VARCHAR2(32),
  CREATE_TIME  DATE	,
  MODIFY_TIME   DATE,
  CARD_ID        VARCHAR2(50),
  GENDER     VARCHAR2(32),
  NICK_NAME      VARCHAR2(50),
  IS_DELETE     VARCHAR2(32),
  PERSON_AVATAR     VARCHAR2(50)
);

insert into CBD_USER
values(1,'管理员',null,null,null,null,null,null,null,null,'admin',0,null);
commit;

create table CBD_LOGIN_LOG
(
  ID             NUMBER(18) not null,
  SYSTEM_CODE     VARCHAR2(50),
  LOGIN_NAME VARCHAR2(50) ,
  LOGIN_TIME  DATE,
  LOGIN_IP  VARCHAR2(50),
  LOGIN_INFO  VARCHAR2(50)
);

create table CBD_ROLE_USER
(
  ID             NUMBER(18),
  ROLE_ID     NUMBER(18),
  USER_ID   NUMBER(18) ,
  CREATOR  VARCHAR2(50),
  CREATE_TIME  DATE
);


