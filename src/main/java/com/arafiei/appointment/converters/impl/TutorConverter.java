package com.arafiei.appointment.converters.impl;

import com.arafiei.appointment.converters.ITutorConverter;
import com.arafiei.appointment.domains.DomainTutor;
import com.arafiei.appointment.views.ViewTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TutorConverter implements ITutorConverter {


    @Override
    public DomainTutor viewToDomain(ViewTutor viewTutor) {
        DomainTutor domainTutor = new DomainTutor();
        domainTutor.setTutorId(viewTutor.getTutorId());
        domainTutor.setTutorName(viewTutor.getTutorName());
        domainTutor.setTutorEmail(viewTutor.getTutorEmail());
        domainTutor.setTutorStatus(viewTutor.getTutorStatus());
        domainTutor.setDay(viewTutor.getDay());
        LocalDateTime now = LocalDateTime.now();
        return domainTutor;
    }

    @Override
    public ViewTutor domainToView(DomainTutor domainTutor) {
        ViewTutor viewTutor = new ViewTutor();
        viewTutor.setTutorId(domainTutor.getTutorId());
        viewTutor.setTutorName(domainTutor.getTutorName());
        viewTutor.setTutorEmail(domainTutor.getTutorEmail());
        viewTutor.setTutorStatus(domainTutor.getTutorStatus());
        viewTutor.setDay(domainTutor.getDay());
        return viewTutor;
    }
}

