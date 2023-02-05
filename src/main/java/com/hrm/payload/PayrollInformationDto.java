package com.hrm.payload;

import com.hrm.entites.Employee;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class PayrollInformationDto {
    private Long id;

    private BigDecimal salary;

    private BigDecimal taxes;

    private BigDecimal deductions;

    private Employee employee;

}
