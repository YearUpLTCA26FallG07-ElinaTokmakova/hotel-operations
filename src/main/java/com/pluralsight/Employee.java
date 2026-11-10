package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked > this.getRegularHours()) {
            return this.payRate * this.getRegularHours() + this.getOvertimeHours() * this.payRate * 1.5;
        }
        return this.payRate * this.hoursWorked;
    }

    public int getRegularHours() {
        return 40;
    }

    public int getOvertimeHours() {
        return this.hoursWorked - 40;
    }

    public void punchTimeCard(int punchIn, int punchOut) {
        hoursWorked += punchOut - punchIn;
    }

    public String punchIn(int time) {
        LocalTime punchIn = LocalTime.of(time, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return punchIn().format(formatter);
    }

    public String punchIn() {
        LocalTime punchIn = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return punchIn.format(formatter);
    }

    public String punchOut(int time) {
        LocalTime punchOut = LocalTime.of(time, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return punchOut().format(formatter);
    }

    public String punchOut() {
        LocalTime punchOut = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return punchOut.format(formatter);
    }
}
