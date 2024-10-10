package com.boram.section01.remix.view;

import java.util.Scanner;

public class EmployeeView {

    public void display() {
        Scanner sc = new Scanner(System.in);
        YejinView yejinView = new YejinView();
        HjPage Hjpage = new HjPage();
        EmployeeViewNamKyu employeeViewNamKyu = new EmployeeViewNamKyu();

        do {

            System.out.println("===================페이지 연결==================");
            System.out.println("1. 남규님 페이지");
            System.out.println("2. 예진님 페이지");
            System.out.println("3. 정현님 페이지");
            System.out.println("4. 경훈님 페이지");
            System.out.println("5. 혜진님 페이지");

            System.out.print("\n접속하실 페이지를 골라주세요: ");

            int num = sc.nextInt();

            switch (num){
                case 1:
                    employeeViewNamKyu.display();
                    break;

                case 2:
                    yejinView.display();
                    break;

                case 3:
                    JeonghyeonView.moonplay();
                    break;

                case 4:
                    break;

                case 5:
                    Hjpage.display();
                    break;

            }

        } while (true);


    }
}
