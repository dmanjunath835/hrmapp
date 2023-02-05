package com.hrm.repository;

import com.hrm.entites.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationRepository extends JpaRepository<PersonalInformation,Long> {
}
