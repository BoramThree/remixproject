package com.boram.section01.remix.controller;

import com.boram.section01.remix.model.dto.EmployeeDTOMoon;
import com.boram.section01.remix.model.service.EmployeeServiceMoon;
import com.boram.section01.remix.view.PrintResultMoon;

import java.util.List;
import java.util.Scanner;

public class EmployeeControllerMoon {

    private final EmployeeServiceMoon employeeServiceMoon;
    private final PrintResultMoon printResultMoon;

    public EmployeeControllerMoon(){
        this.employeeServiceMoon = new EmployeeServiceMoon();
        this.printResultMoon = new PrintResultMoon();
    }

    public void selectAllEmployee() {

        List<EmployeeDTOMoon> employeeList = employeeServiceMoon.selectAllEmployee();
        if (employeeList != null){
            PrintResultMoon.printEmployeeList
        }


    }
}