package com.boram.section01.remix.view;

import com.boram.section01.remix.model.dto.EmployeeDTOMoon;

import java.util.List;

public class PrintResultMoon {
    public void printEmployeeList (List<EmployeeDTOMoon> employeeList){

        System.out.println("님이 요청하신 전체조회 결과입니다!");

        for (EmployeeDTOMoon employee : employeeList){
            System.out.println(employee);
        }
    }
}
