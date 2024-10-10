package com.boram.section01.remix.controller;

import com.boram.section01.remix.model.dto.EmployeeDTOYejin;
import com.boram.section01.remix.model.service.EmployeeServiceYejin;
import com.boram.section01.remix.view.YejinPrintView;

import java.util.List;
import java.util.Map;

public class EmployeeControllerYejin {

    private EmployeeServiceYejin employeeServiceYejin;
    private YejinPrintView yejinPrintView;

    public EmployeeControllerYejin(){
        this.employeeServiceYejin = new EmployeeServiceYejin();
        this.yejinPrintView = new YejinPrintView();
    }

    public void selectEmp(Map<String, String> stringStringMap) {
        List<EmployeeDTOYejin> empList =  employeeServiceYejin.selectEmpList(stringStringMap);

        if (empList != null){
            yejinPrintView.printEmpList(empList);
        } else {
            yejinPrintView.printErrorMsg("selectEmpList");
        }
    }


    public void insertNewEmp(Map<String, String> stringStringMap) {
    }
}
