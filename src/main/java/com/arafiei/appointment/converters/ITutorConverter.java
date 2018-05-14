package com.arafiei.appointment.converters;

import com.arafiei.appointment.domains.DomainTutor;
import com.arafiei.appointment.views.ViewTutor;

public interface ITutorConverter {

    DomainTutor viewToDomain(ViewTutor viewTutor);
    ViewTutor domainToView(DomainTutor domainTutor);

}
