package com.arafiei.appointment.views;

import com.arafiei.appointment.domains.DomainTutor;

import java.util.Objects;

public class ViewStudent {

    private Long studentId;
    private String studentName;
    private String studentEmail;
    private Long tutorID;


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

    public Long getTutorID() {
        return tutorID;
    }

    public void setTutorID(Long tutorID) {
        this.tutorID = tutorID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewStudent that = (ViewStudent) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(studentName, that.studentName) &&
                Objects.equals(studentEmail, that.studentEmail) &&
                Objects.equals(tutorID, that.tutorID);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, studentName, studentEmail, tutorID);
    }

    @Override
    public String toString() {
        return "ViewStudent{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", tutorID=" + tutorID +
                '}';
    }
}
