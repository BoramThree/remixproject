package com.boram.section01.remix.model.dto;

import java.util.Date;

public class EmployeeDTONamKyu {
    private int empID;
    private String empName;
    private String empNo;
    private int salary;
    private double bonus;


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String toString() {
        return "EmployeeDTONamKyu{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}