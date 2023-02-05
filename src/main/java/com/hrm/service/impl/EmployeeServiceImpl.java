package com.hrm.service.impl;

import com.hrm.entites.Employee;
import com.hrm.payload.EmployeeDto;
import com.hrm.repository.EmployeeRepository;
import com.hrm.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    private ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,ModelMapper modelMapper) {
        this.modelMapper=modelMapper;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = mapToEntity(employeeDto);
        Employee employees = employeeRepository.save(employee);
        EmployeeDto employeeDto1 = mapToDto(employees);

        return employeeDto1;
    }

    private EmployeeDto mapToDto(Employee employees) {
        EmployeeDto employeeDto = modelMapper.map(employees, EmployeeDto.class);
        return employeeDto;
    }

    private Employee mapToEntity(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        return employee;
    }
}
