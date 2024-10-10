package com.boram.section01.remix.view;

import com.boram.section01.remix.model.dto.HjPeopleDTO;

import java.util.List;

public class HJResult {

    public void printPeopleList(List<HjPeopleDTO> peopleList) {

        System.out.println("요청하신 전체 사원 조회 결과 입니다.");

        for(HjPeopleDTO hjPeople : peopleList) {
            System.out.println(hjPeople);
        }

        System.out.println("================================");

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" :
                errorMessage = "전체 조회에 실패하셨습니다...";
                break;
        }

        System.out.println(errorMessage);

    }

}
