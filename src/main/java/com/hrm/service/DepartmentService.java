package com.hrm.service;

import com.hrm.payload.DepartmentDto;

public interface DepartmentService {
    DepartmentDto createDepartment(long employeeId, DepartmentDto departmentDto);
}
