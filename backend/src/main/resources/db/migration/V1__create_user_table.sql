DROP TABLE IF EXISTS public.user;
CREATE TABLE public.user (
    id SERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    birth_date DATE NOT NULL,
    user_password VARCHAR(255) NOT NULL,
    email_address VARCHAR(255) NOT NULL
);