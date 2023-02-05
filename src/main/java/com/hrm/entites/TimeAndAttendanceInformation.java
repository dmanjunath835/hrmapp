package com.hrm.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="time_and_Attendance")
public class TimeAndAttendanceInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time_off_requests")
    private Integer timeOffRequests;

    @Column(name = "time_worked")
    private Integer timeWorked;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
