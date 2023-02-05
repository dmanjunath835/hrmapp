package com.hrm.repository;

import com.hrm.entites.PayrollInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayrollInformationRepository extends JpaRepository<PayrollInformation,Long> {
}
