package com.arafiei.appointment.managers;

import com.arafiei.appointment.views.ViewTutor;

import java.util.List;

public interface ITutorManager {

    List<ViewTutor> getAllTutors();
    ViewTutor getTutorById(Long tutorId);
    ViewTutor createTutor(ViewTutor viewTutor);
    ViewTutor updateTutor(Long tutorId, ViewTutor viewTutor);
    ViewTutor deleteTutor(Long postId);
    List<ViewTutor> getTutorsByStatus(String status);
    List<ViewTutor> getTutorsByDay(String day);
}

