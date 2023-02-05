package com.hrm.payload;

import com.hrm.entites.Department;
import com.hrm.entites.Employee;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Data
public class StatusInformationDto {
    private Long id;

    private String jobTitle;

    private Department department;

    private String employmentType;

    private Employee employee;

}
