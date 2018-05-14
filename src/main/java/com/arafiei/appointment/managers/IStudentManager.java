package com.arafiei.appointment.managers;

import com.arafiei.appointment.views.ViewStudent;


import java.util.List;

public interface IStudentManager {

    List<ViewStudent> getAllStudents();
    ViewStudent createStudents(ViewStudent viewStudent);
}
