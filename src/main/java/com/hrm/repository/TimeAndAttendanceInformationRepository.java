package com.hrm.repository;

import com.hrm.entites.TimeAndAttendanceInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeAndAttendanceInformationRepository extends JpaRepository<TimeAndAttendanceInformation,Long> {
}
