package com.boram.section01.remix.view;

import com.boram.section01.remix.model.dto.EmployeeDTOYejin;

import java.util.List;

public class YejinPrintView {
    public void printEmpList(List<EmployeeDTOYejin> empList) {

        System.out.println("==========요청하신 결과입니다.===========");
        for (EmployeeDTOYejin emp : empList){
            System.out.println(emp);
        }

    }

    public void printErrorMsg(String errorMsg) {

        String outputErrorMsg = "";

        switch (errorMsg){
            case "selectEmpList":
                outputErrorMsg = "사원 목록 조회에 실패했습니다.";
                break;

        }

        System.out.println("에러 메세지: " + outputErrorMsg);

    }
}
