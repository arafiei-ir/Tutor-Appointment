package com.arafiei.appointment.views;

import java.util.Objects;

public class ViewTutor {

    private Long tutorId;
    private String tutorName;
    private String tutorEmail;
    private String tutorStatus;
    private String day;

    public Long getTutorId() {
        return tutorId;
    }

    public void setTutorId(Long tutorId) {
        this.tutorId = tutorId;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutorEmail() {
        return tutorEmail;
    }

    public void setTutorEmail(String tutorEmail) {
        this.tutorEmail = tutorEmail;
    }

    public String getTutorStatus() {
        return tutorStatus;
    }

    public void setTutorStatus(String tutorStatus) {
        this.tutorStatus = tutorStatus;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewTutor viewTutor = (ViewTutor) o;
        return Objects.equals(tutorId, viewTutor.tutorId) &&
                Objects.equals(tutorName, viewTutor.tutorName) &&
                Objects.equals(tutorEmail, viewTutor.tutorEmail) &&
                Objects.equals(tutorStatus, viewTutor.tutorStatus) &&
                Objects.equals(day, viewTutor.day);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tutorId, tutorName, tutorEmail, tutorStatus, day);
    }

    @Override
    public String toString() {
        return "ViewTutor{" +
                "tutorId=" + tutorId +
                ", tutorName='" + tutorName + '\'' +
                ", tutorEmail='" + tutorEmail + '\'' +
                ", tutorStatus='" + tutorStatus + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}

