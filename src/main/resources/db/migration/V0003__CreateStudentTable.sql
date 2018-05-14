create table students(
  student_id BIGSERIAL not null PRIMARY KEY,
  student_name text not null,
  student_email text not null,
  tutor_id BIGINT REFERENCES tutors(tutor_id)
)
