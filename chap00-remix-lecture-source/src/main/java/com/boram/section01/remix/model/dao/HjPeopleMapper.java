package com.boram.section01.remix.model.dao;

import com.boram.section01.remix.model.dto.HjPeopleDTO;

import java.util.List;

public interface HjPeopleMapper {

    List<HjPeopleDTO> selectAllPeople();

}
