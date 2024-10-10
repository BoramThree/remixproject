package com.boram.section01.remix.model.service;

import com.boram.section01.remix.model.dao.HjPeopleMapper;
import com.boram.section01.remix.model.dto.HjPeopleDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.boram.section01.remix.common.HJTemplate.getSqlSession;

public class HJService {

    private HjPeopleMapper hjPeopleMapper;

    public List<HjPeopleDTO> selectAllPeople() {

        SqlSession sqlSession = getSqlSession();

        hjPeopleMapper = sqlSession.getMapper(HjPeopleMapper.class);

        List<HjPeopleDTO> peopleList = hjPeopleMapper.selectAllPeople();

        // 4. 사용한 sqlSession 닫기
        sqlSession.close();

        return peopleList;
    }

}
