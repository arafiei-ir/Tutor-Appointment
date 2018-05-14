package com.arafiei.appointment.acessors;

import com.arafiei.appointment.domains.DomainTutor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITutorAccessor extends JpaRepository<DomainTutor, Long> {

    List<DomainTutor> findAllByTutorStatus(String status);
    List<DomainTutor> findAllByDayContains(String day);

}
