create table student_tutors(
  student_id NUMBER,
  tutor_id NUMBER,
  FOREIGN KEY(student_id) REFERENCES students(student_id),
  FOREIGN KEY(tutor_id) REFERENCES tutors(tutor_id),
  PRIMARY KEY(student_id, tutor_id),
)