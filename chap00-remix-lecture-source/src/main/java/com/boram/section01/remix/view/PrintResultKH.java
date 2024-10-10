package com.boram.section01.remix.view;

import com.boram.section01.remix.model.dto.EmployeeDTOKH;

import java.util.List;

public class PrintResultKH {




    public void printEmployeeList(List<EmployeeDTOKH> employeeList) {

        System.out.println("요청하신 전체 직원 조회 결과 입니다.");

        for(EmployeeDTOKH employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("================================");


    }




    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "직원 전체 조회에 실패하셨습니다...";
                break;
            case "selectOne" :
                errorMessage = "메뉴코드로 메뉴 조회에 실패하셨습니다...";
                break;
            case "insert" :
                errorMessage = "신규 메뉴 등록에 실패하셨습니다...";
                break;
            case "update" :
                errorMessage = "메뉴 수정에 실패하셨습니다...";
                break;
            case "delete" :
                errorMessage = "메뉴 삭제에 실패하셨습니다...";
                break;
        }

        System.out.println(errorMessage);
    }



}
