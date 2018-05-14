package com.arafiei.appointment.domains;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "students")
public class DomainStudent {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_email")
    private String studentEmail;
    @Column(name = "tutor_id")
    private Long tutorId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DomainStudent that = (DomainStudent) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentEmail, that.studentEmail) &&
                Objects.equals(tutorId, that.tutorId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, studentName, studentEmail, tutorId);
    }

    @Override
    public String toString() {
        return "DomainStudent{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", tutorId=" + tutorId +
                '}';
    }
}