package com.arafiei.appointment.managers.impl;

import com.arafiei.appointment.acessors.ITutorAccessor;
import com.arafiei.appointment.converters.ITutorConverter;
import com.arafiei.appointment.domains.DomainTutor;
import com.arafiei.appointment.managers.ITutorManager;
import com.arafiei.appointment.views.ViewTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TutorManager implements ITutorManager {

    @Autowired
    private ITutorAccessor tutorAccessor;

    @Autowired
    private ITutorConverter tutorConverter;

    @Override
    public List<ViewTutor> getAllTutors() {

        return tutorAccessor.findAll().stream()
                .map(tutorConverter::domainToView)
                .collect(Collectors.toList());
    }

    @Override
    public ViewTutor getTutorById(Long tutorId) {

        DomainTutor domainTutor = tutorAccessor.findOne(tutorId);
        if(domainTutor == null){
            throw new EntityNotFoundException("Unable to retrieve tutor: " + tutorId.toString());
        }

        return tutorConverter.domainToView(domainTutor);
    }

    @Override
    public ViewTutor createTutor(ViewTutor viewTutor) {

        return tutorConverter.domainToView(tutorAccessor.save(tutorConverter.viewToDomain(viewTutor)));
    }

    @Override
    public ViewTutor updateTutor(Long tutorId, ViewTutor viewTutor) {

        DomainTutor domainTutor = tutorAccessor.findOne(tutorId);
        if(domainTutor == null){
            throw new EntityNotFoundException("Unable to retrieve tutor: " + tutorId.toString());
        } else if(!viewTutor.getTutorId().equals(tutorId)){
            throw new InvalidParameterException("Provided tutor is: " + tutorId + " does not match provided tutor: " + viewTutor);
        }

        return tutorConverter.domainToView(tutorAccessor.save(tutorConverter.viewToDomain(viewTutor)));

    }

    @Override
    public ViewTutor deleteTutor(Long tutorId) {

        DomainTutor domainTutor = tutorAccessor.findOne(tutorId);
        if(domainTutor == null){
            throw new EntityNotFoundException("Unable to retrieve tutor: " + tutorId.toString());
        }

        tutorAccessor.delete(tutorId);
        return tutorConverter.domainToView(domainTutor);
    }

    @Override
    public List<ViewTutor> getTutorsByStatus(String status) {

        return tutorAccessor.findAllByTutorStatus(status).stream()
                .map(tutorConverter::domainToView)
                .collect(Collectors.toList());
    }

    @Override
    public List<ViewTutor> getTutorsByDay(String day) {
        return tutorAccessor.findAllByDayContains(day).stream()
                .map(tutorConverter::domainToView)
                .collect(Collectors.toList());
    }
}
