package com.boram.section01.remix.view;

import com.boram.section01.remix.controller.EmployeeControllerKH;

import java.util.Scanner;

public class KHView {


    public void khDisplay() {
        Scanner sc = new Scanner(System.in);
        EmployeeControllerKH employeeControllerKH = new EmployeeControllerKH();

        do {

            System.out.println("=====================================");
            System.out.println("1. 경훈 페이지");
            int num = sc.nextInt();

            switch (num){
                case 1: employeeControllerKH.selectAllEmployee();
                    break;

                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

            }

        } while (true);


    }
}
