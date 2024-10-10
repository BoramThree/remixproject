
package com.boram.section01.remix.view;

import com.boram.section01.remix.controller.EmployeeControllerNamKyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeViewNamKyu {

    public void display(){

    Scanner sc = new Scanner(System.in);
    EmployeeControllerNamKyu empControllerNam = new EmployeeControllerNamKyu();


    do{
        System.out.println("=====Employee 메뉴 관리 시스템====");
        System.out.println(" 1.메뉴 전체 조회하기");
        System.out.println(" 2 보너스 있는 직원 조회하기 ");
        System.out.println(" 3 보너스 추가 등록하기 ");
        System.out.println(" 4 보너스 수정하기");
        System.out.println(" 5 보너스 삭제하기");
        System.out.println("===============================");
        System.out.print("실행할 메뉴를 선택 하세요! : ");
        int no = sc.nextInt();

            switch(no){
                case 1 :
                    empControllerNam.selectAllEmployee();
                    break;
                case 2 :
                    empControllerNam.selectEmployeeByBonus(inputEmployeeBonus());
                    break;
            }

        }while (true);
    }

    private static Map<String,String> inputEmployeeBonus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 회원 아이디를 입력 해주세요!! : ");
        String empId = sc.nextLine();
        Map<String,String> parameter = new HashMap<>();
        parameter.put("empId",empId);
        return parameter;

    }

}

