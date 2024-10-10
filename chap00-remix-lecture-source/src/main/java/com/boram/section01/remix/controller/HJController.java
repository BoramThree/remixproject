package com.boram.section01.remix.controller;

import com.boram.section01.remix.model.dto.HjPeopleDTO;
import com.boram.section01.remix.model.service.HJService;
import com.boram.section01.remix.view.HJResult;

import java.util.List;

public class HJController {

    private final HJService hjService;
    private final HJResult hjResult;

    public HJController() {
        this.hjService = new HJService();
        this.hjResult = new HJResult();
    }

    public void selectAllPeople() {

        List<HjPeopleDTO> peopleList = hjService.selectAllPeople();

        // 정상 조회
        if (peopleList != null) {
            hjResult.printPeopleList(peopleList);
        } else {
            hjResult.printErrorMessage("peopleList");
        }

    }

}
