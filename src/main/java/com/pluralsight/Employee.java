package com.pluralsight;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked = 0;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

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

    public String getTotalPay() {
            return "Total pay: " + this.getRegularHours() * this.payRate + this.getOvertimeHours() * this.payRate * 1.5;
    }

    public int getRegularHours() {
        if(this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    public int getOvertimeHours() {
        if(this.hoursWorked <=40) {
            return 0;
        } else {
            return this.hoursWorked - 40;
        }
    }

    public void punchTimeCard(int punchIn, int punchOut) {
        hoursWorked += punchOut - punchIn;
    }

    public int punchIn(int time) {
//        LocalTime punchIn = LocalTime.of(time, 0);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//        return punchIn().format(formatter);
        return time;
    }

    public String punchIn() {
        LocalTime punchIn = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return punchIn.format(formatter);
    }

    public int punchOut(int time) {
//        LocalTime punchOut = LocalTime.of(time, 0);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
//        return punchOut().format(formatter);
        return time;
    }

    public String punchOut() {
        LocalTime punchOut = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return punchOut.format(formatter);
    }
}
