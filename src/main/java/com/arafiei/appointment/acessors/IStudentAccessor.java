package com.arafiei.appointment.acessors;

import com.arafiei.appointment.domains.DomainStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentAccessor extends JpaRepository<DomainStudent, Long> {

}
