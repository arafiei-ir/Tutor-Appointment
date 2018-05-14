package com.arafiei.appointment.converters.impl;


import com.arafiei.appointment.converters.IStudentConverter;
import com.arafiei.appointment.domains.DomainStudent;
import com.arafiei.appointment.views.ViewStudent;
import org.springframework.stereotype.Service;

@Service
public class StudentConverter implements IStudentConverter{

    @Override
    public DomainStudent viewToDomain(ViewStudent viewStudent){
        DomainStudent domainStudent = new DomainStudent();
        domainStudent.setStudentId(viewStudent.getStudentId());
        domainStudent.setStudentName(viewStudent.getStudentName());
        domainStudent.setStudentEmail(viewStudent.getStudentEmail());
        domainStudent.setTutorId(viewStudent.getTutorID());
        return domainStudent;
    }

    @Override
    public ViewStudent domainToView(DomainStudent domainStudent) {

        ViewStudent viewStudent = new ViewStudent();
        viewStudent.setStudentId(domainStudent.getStudentId());
        viewStudent.setStudentName(domainStudent.getStudentName());
        viewStudent.setStudentEmail(domainStudent.getStudentName());
        viewStudent.setTutorID(domainStudent.getTutorId());
        return viewStudent;
    }
}
