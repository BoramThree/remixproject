package com.boram.section01.remix.controller;

import com.boram.section01.remix.model.dto.EmployeeDTOKH;
import com.boram.section01.remix.model.service.EmployeeServiceKH;
import com.boram.section01.remix.view.PrintResultKH;

import java.util.List;

public class EmployeeControllerKH {

    private final EmployeeServiceKH employeeServiceKH;
    private final PrintResultKH printResultKH;

    public EmployeeControllerKH() {
        this.employeeServiceKH = new EmployeeServiceKH();
        this.printResultKH = new PrintResultKH();
    }




    public void selectAllEmployee() {



        List<EmployeeDTOKH> EmployeeList = EmployeeServiceKH.selectAllEmployee();

        // 정상 조회
        if(EmployeeList != null) {
            printResultKH.printEmployeeList(EmployeeList);
        } else {
            printResultKH.printErrorMessage("selectList");
        }

    }
}
