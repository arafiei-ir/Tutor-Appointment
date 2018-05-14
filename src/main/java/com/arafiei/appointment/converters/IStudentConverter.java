package com.arafiei.appointment.converters;

import com.arafiei.appointment.domains.DomainStudent;
import com.arafiei.appointment.views.ViewStudent;

public interface IStudentConverter {

    DomainStudent viewToDomain(ViewStudent viewStudent);
    ViewStudent domainToView(DomainStudent domainStudent);
}
