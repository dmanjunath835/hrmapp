package com.hrm.payload;

import com.hrm.entites.Employee;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
public class BenefitsInformationDto {
    private Long id;
    private String healthInsurance;
    private String retirementPlans;
    private Employee employee;
}
