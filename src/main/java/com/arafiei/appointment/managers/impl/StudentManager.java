package com.arafiei.appointment.managers.impl;

import com.arafiei.appointment.acessors.IStudentAccessor;
import com.arafiei.appointment.converters.IStudentConverter;
import com.arafiei.appointment.managers.IStudentManager;
import com.arafiei.appointment.views.ViewStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentManager implements IStudentManager {

    @Autowired
    private IStudentAccessor studentAccessor;

    @Autowired
    private IStudentConverter studentConverter;


    @Override
    public List<ViewStudent> getAllStudents() {
        return studentAccessor.findAll().stream()
                .map(studentConverter::domainToView)
                .collect(Collectors.toList());
    }

    @Override
    public ViewStudent createStudents(ViewStudent viewStudent) {
        return studentConverter.domainToView(studentAccessor.save(studentConverter.viewToDomain(viewStudent)));
    }
}
