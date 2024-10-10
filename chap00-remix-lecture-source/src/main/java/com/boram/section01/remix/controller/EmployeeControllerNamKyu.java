package com.boram.section01.remix.controller;

import com.boram.section01.remix.model.dto.EmployeeDTONamKyu;
import com.boram.section01.remix.model.service.EmployeeServiceNamKyu;
import com.boram.section01.remix.view.PrintResultViewNamKyu;

import java.util.List;
import java.util.Map;

public class EmployeeControllerNamKyu {

    private final EmployeeServiceNamKyu employeeServiceNamKyu; // 서비스 내용 수정못하게 사용함
    private final PrintResultViewNamKyu printResultViewNamKyu; // 출력하는 내용 수정못하게 사용함

    public EmployeeControllerNamKyu() {
        this.employeeServiceNamKyu = new EmployeeServiceNamKyu();
        this.printResultViewNamKyu = new PrintResultViewNamKyu();
    }


    public void selectAllEmployee() {
        List<EmployeeDTONamKyu> empList = employeeServiceNamKyu.selectAllEmployee();


        printResultViewNamKyu.printEmpList(empList);
    }

    public void selectEmployeeByBonus(Map<String, String> parameter) {

    }

}