DROP TABLE IF EXISTS public.courses;
CREATE TABLE courses (
  id SERIAL PRIMARY KEY NOT NULL,
  name VARCHAR(255) NOT NULL,
  description TEXT NOT NULL,
  price DECIMAL(10, 2) NOT NULL,
  objectives TEXT NOT NULL,
  media_path VARCHAR(255) NOT NULL
);