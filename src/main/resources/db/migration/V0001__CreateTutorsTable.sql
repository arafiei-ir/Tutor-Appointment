create table tutors (
  tutor_id BIGSERIAL primary key,
  tutor_name text not null,
  tutor_email text not null,
  tutor_status text not null,
  day text not null,
);

