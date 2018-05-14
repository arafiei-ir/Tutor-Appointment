package com.arafiei.appointment.domains;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tutors")
public class DomainTutor {

    @Id
    @Column(name = "tutor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tutorId;

    @Column(name = "tutor_name")
    private String tutorName;

    @Column(name = "tutor_email")
    private String tutorEmail;

    @Column(name = "tutor_status")
    private String tutorStatus;

    @Column(name = "day")
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
        DomainTutor that = (DomainTutor) o;
        return Objects.equals(tutorId, that.tutorId) &&
                Objects.equals(tutorName, that.tutorName) &&
                Objects.equals(tutorEmail, that.tutorEmail) &&
                Objects.equals(tutorStatus, that.tutorStatus) &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tutorId, tutorName, tutorEmail, tutorStatus, day);
    }

    @Override
    public String toString() {
        return "DomainTutor{" +
                "tutorId=" + tutorId +
                ", tutorName='" + tutorName + '\'' +
                ", tutorEmail='" + tutorEmail + '\'' +
                ", tutorStatus='" + tutorStatus + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}