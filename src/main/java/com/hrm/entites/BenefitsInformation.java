package com.hrm.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="benefits_information")
public class BenefitsInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "health_insurance")
    private String healthInsurance;

    @Column(name = "retirement_plans")
    private String retirementPlans;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters and setters
}

