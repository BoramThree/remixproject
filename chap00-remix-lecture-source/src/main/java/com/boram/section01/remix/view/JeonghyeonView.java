package com.boram.section01.remix.view;

import com.boram.section01.remix.controller.EmployeeControllerMoon;

import java.util.Scanner;

public class JeonghyeonView {

    public static void moonplay() {
        Scanner sc = new Scanner(System.in);
        EmployeeControllerMoon employeeControllerMoon = new EmployeeControllerMoon();

        do {
            System.out.println("======================moon 메뉴 관리 시스템=============================");
            System.out.println("1. 메뉴 전체 조회하기");
            System.out.println("2. 신입사원 등록하기");
            System.out.println("=========================================================================");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();
            //

            switch (no) {
                case 1:
                    employeeControllerMoon.selectAllEmployee();
                    break;
            }
        }while (true);
    }
}
