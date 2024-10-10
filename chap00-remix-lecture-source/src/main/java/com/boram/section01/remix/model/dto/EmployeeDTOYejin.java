package com.boram.section01.remix.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDTOYejin {

    private String empId;
    private String empName;
    private String empNo;
    private int salary;
    private double bonus;
    private Date hireDate;

    public EmployeeDTOYejin(){}

    public EmployeeDTOYejin(String empId, String empName, String empNo, int salary, double bonus, Date hireDate) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
        this.salary = salary;
        this.bonus = bonus;
        this.hireDate = hireDate;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

    @Override
    public String toString() {
        return "EmployeeDTOYejin{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", hireDate= " + dateFormat.format(hireDate) +
                '}';
    }
}
