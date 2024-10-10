package com.boram.section01.remix.view;

import com.boram.section01.remix.controller.EmployeeControllerYejin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YejinView {

    public void display() {

        Scanner sc = new Scanner(System.in);
        EmployeeControllerYejin employeeControllerYejin = new EmployeeControllerYejin();

        do {

            System.out.println("\n===========예진 프로그램============");
            System.out.println("1. 원하는 년도 사이의 입사 사원 조회하기");
            System.out.println("2. 신입사원 등록하기");
            System.out.println("3. 급여 조정");
            System.out.println("4. 해고하기");
            System.out.println("99. 이전 메뉴 화면으로 돌아가기");

            System.out.print("\n원하시는 메뉴를 선택해주세요:");

            int num = sc.nextInt();

            switch (num){
                case 1:
                    employeeControllerYejin.selectEmp(selectEmpInfo());
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 99:
                    break;
            }

        } while (true);
    }

    private static Map<String,String> selectEmpInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("몇년도부터 조회를 시작할까요?: ");
        String startYear = sc.nextLine();

        System.out.print("몇년도까지 조회할까요?: ");
        String endYear = sc.nextLine();
        
        Map<String, String> mapInfo = new HashMap<>();

        mapInfo.put("startYear",startYear);
        mapInfo.put("endYear",endYear);

        return mapInfo;
    }
}
