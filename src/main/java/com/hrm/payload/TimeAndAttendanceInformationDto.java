package com.hrm.payload;

import com.hrm.entites.Employee;
import lombok.Data;


@Data
public class TimeAndAttendanceInformationDto {
    private Long id;
    private Integer timeOffRequests;
    private Integer timeWorked;
    private Employee employee;
}
