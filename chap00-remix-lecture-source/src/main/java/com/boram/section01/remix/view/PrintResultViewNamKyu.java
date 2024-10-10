package com.boram.section01.remix.view;

import com.boram.section01.remix.model.dto.EmployeeDTONamKyu;

import java.util.List;

public class PrintResultViewNamKyu {

    public void printEmpList(List<EmployeeDTONamKyu> empList) {

        System.out.println("요청하신 전체 메뉴 조회 결과 입니다.");

        for(EmployeeDTONamKyu empDTONamKyu : empList){
            System.out.println(empDTONamKyu);
        }

    }



    public void printErroeMessage(String error) {

        String errorMessage = "";

        switch(error){
            case "selectList" :
                errorMessage = "메뉴 전체 조회에 실패했습니다!";
                break;
            case "selectOne" :
                errorMessage = "메뉴코드로 메뉴 조회에 실패 하셔습니다.";
                break;
            case "insert" :
                errorMessage = "신규 메뉴 등록에 실패 하셨습니다. 유감이네요";
                break;
            case "update" :
                errorMessage = "메뉴 수정에 실패 했습니다.";
                break;

        }

        System.out.println(errorMessage);



    }






}