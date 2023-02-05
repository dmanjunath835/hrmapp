package com.hrm.payload;

import com.hrm.entites.Employee;
import lombok.Data;

import javax.persistence.*;
@Data
public class DepartmentDto{
    private Long id;
    private String manager;
    private String role;
    @OneToOne(mappedBy = "department",cascade = CascadeType.ALL)
    private Employee employee;
}
