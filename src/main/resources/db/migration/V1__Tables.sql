----------------------------------------
------------- SEQUENCES ----------------
----------------------------------------
-- SEQUENCE: sq_user
-- DROP SEQUENCE public.sq_user;
CREATE SEQUENCE public.sq_user   
    INCREMENT BY 1 
    MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- SEQUENCE: sq_project
-- DROP SEQUENCE public.sq_project;
CREATE SEQUENCE public.sq_project   
    INCREMENT BY 1 
    MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- SEQUENCE: sq_report
-- DROP SEQUENCE public.sq_report;
CREATE SEQUENCE public.sq_report   
    INCREMENT BY 1 
    MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;




----------------------------------------
--------------- TABLES -----------------
----------------------------------------

---------------------------------------
----------------USERS------------------
---------------------------------------

-- TABLE: tb_user
-- DROP TABLE public.tb_user;
CREATE TABLE public.tb_user (
	id_user BIGINT NOT NULL DEFAULT nextval('public.sq_user'::regclass),
	cpf VARCHAR(11) NOT NULL,
	name VARCHAR(150) NOT NULL,
	email VARCHAR(100) NOT NULL,
	phone_number VARCHAR(15) NULL,
	active BOOL NOT NULL,
	user_name VARCHAR(150) NOT NULL,
	password VARCHAR(150) NOT NULL,
	roles VARCHAR(150) NOT NULL,
	dt_creation TIMESTAMP NOT NULL,
	dt_update TIMESTAMP,
	CONSTRAINT pk_user PRIMARY KEY (id_user)
);

CREATE UNIQUE INDEX tb_user_cpf ON public.tb_user (cpf);

-- ---------------------------------------
-- ---------------PROJECT-----------------
-- ---------------------------------------

CREATE TABLE public.tb_project (
	id_project BIGINT NOT NULL DEFAULT nextval('public.sq_project'::regclass),
	name_project VARCHAR(150),
	id_responsible_user BIGINT,
	dt_creation TIMESTAMP NOT NULL
);


-- ---------------------------------------
-- ---------------REPORT------------------
-- ---------------------------------------

CREATE TABLE public.tb_report (
	id_report BIGINT NOT NULL DEFAULT nextval('public.sq_report'::regclass),
	name_report VARCHAR(150),
	id_report_creator BIGINT,
	dt_creation TIMESTAMP NOT NULL
);