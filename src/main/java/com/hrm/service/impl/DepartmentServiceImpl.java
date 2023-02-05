package com.hrm.service.impl;

import com.hrm.entites.Department;
import com.hrm.entites.Employee;
import com.hrm.exception.ResourceNotFoundException;
import com.hrm.payload.DepartmentDto;
import com.hrm.repository.DepartmentRepository;
import com.hrm.repository.EmployeeRepository;
import com.hrm.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;
   private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository,EmployeeRepository employeeRepository,ModelMapper modelMapper) {
        this.departmentRepository = departmentRepository;
        this.modelMapper=modelMapper;
        this.employeeRepository=employeeRepository;
    }

    @Override
    public DepartmentDto createDepartment(long employeeId, DepartmentDto departmentDto) {
        Department department = mapToEntity(departmentDto);
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(() ->
                new ResourceNotFoundException("employee", "id", employeeId));
                 department.setEmployee(employee);
        Department departments = departmentRepository.save(department);
        return   mapToDto(departments);
    }

    private DepartmentDto mapToDto(Department departments) {
        DepartmentDto d = modelMapper.map(departments, DepartmentDto.class);

return d;
    }

    private Department mapToEntity(DepartmentDto departmentDto) {
        Department department = modelMapper.map(departmentDto, Department.class);
        return department;
    }
}
