package com.hrm.repository;

import com.hrm.entites.StatusInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusInformationRepository extends JpaRepository<StatusInformation,Long> {
}
