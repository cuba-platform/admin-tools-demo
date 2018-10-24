-- begin ADMINTOOLSDEMO_CONTRACT
create table ADMINTOOLSDEMO_CONTRACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CONTRACTOR_ID varchar(36),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end ADMINTOOLSDEMO_CONTRACT
-- begin ADMINTOOLSDEMO_CONTRACTOR
create table ADMINTOOLSDEMO_CONTRACTOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ADMINTOOLSDEMO_CONTRACTOR
