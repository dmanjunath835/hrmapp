package com.hrm.repository;

import com.hrm.entites.Department;
import com.hrm.payload.DepartmentDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
 Department findById(long employeeId);
}
