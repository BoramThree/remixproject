package com.boram.section01.remix.controller;

import com.boram.section01.remix.model.dto.HjPeopleDTO;
import com.boram.section01.remix.model.service.HjService;
import com.boram.section01.remix.view.HjResult;

import java.util.List;

public class HjController {

    private final HJService hjService;
    private final HJResult hjResult;

    public HjController() {
        this.hjService = new HjService();
        this.hjResult = new HjResult();
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
