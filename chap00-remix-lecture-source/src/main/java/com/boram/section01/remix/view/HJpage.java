package com.boram.section01.remix.view;

import com.boram.section01.remix.controller.HJController;

import java.util.Scanner;

public class HJpage {

    public void view() {

        Scanner sc = new Scanner(System.in);
        HJController hjController = new HJController();

        do {

            System.out.println("* HJ COMPANY *");
            System.out.println("1. 모든 사원 조회");
            System.out.print("실행할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    hjController.selectAllPeople();
                    break;
            }
        } while (true);
    }
}
