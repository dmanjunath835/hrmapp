package com.hrm.controller;

import com.hrm.payload.DepartmentDto;
import com.hrm.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class DepartmentRestController {
private DepartmentService departmentService;

    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @PostMapping("/{employeeId}/department")
    private ResponseEntity<DepartmentDto>createDepartment(@PathVariable("employeeId")long employeeId, @RequestBody DepartmentDto departmentDto){
        DepartmentDto dto = departmentService.createDepartment(employeeId, departmentDto);

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}
