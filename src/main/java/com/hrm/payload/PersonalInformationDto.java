package com.hrm.payload;

import com.hrm.entites.Employee;
import lombok.Data;


@Data
public class PersonalInformationDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String email;

    private String phone;

    private String emergencyContactName;

    private String emergencyContactPhone;

    private Employee employee;

}
