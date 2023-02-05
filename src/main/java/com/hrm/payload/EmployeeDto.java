package com.hrm.payload;

import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String name;
    private String email;
    private long number;
    private String address;
}
