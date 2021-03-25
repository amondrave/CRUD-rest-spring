-- Table: public.product_types

-- DROP TABLE public.product_types;

CREATE TABLE public.product_types
(
    id integer NOT NULL,
    name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT product_types_pkey PRIMARY KEY (id),
    CONSTRAINT uk_6iopyn5hbyxusogmmwjr5ci2q UNIQUE (name)
)

TABLESPACE pg_default;

ALTER TABLE public.product_types
    OWNER to postgres;



-- Table: public.products

-- DROP TABLE public.products;

CREATE TABLE public.products
(
    id integer NOT NULL,
    available boolean,
    description character varying(100) COLLATE pg_catalog."default",
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    type_id integer,
    CONSTRAINT products_pkey PRIMARY KEY (id),
    CONSTRAINT fk98l10qwb1l2ywp1d24x1d3ef2 FOREIGN KEY (type_id)
        REFERENCES public.product_types (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.products
    OWNER to postgres;
