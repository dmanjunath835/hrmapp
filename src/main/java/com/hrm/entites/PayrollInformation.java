package com.hrm.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pay_role_information")
public class PayrollInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "taxes")
    private BigDecimal taxes;

    @Column(name = "deductions")
    private BigDecimal deductions;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters and setters
}