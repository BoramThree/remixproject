package com.boram.section01.remix.model.service;

import com.boram.section01.remix.model.dao.EmployeeMapperNamKyu;
import com.boram.section01.remix.model.dto.EmployeeDTONamKyu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.boram.section01.remix.common.Template.getSqlSession;

public class EmployeeServiceNamKyu {

    private EmployeeMapperNamKyu employeeMapperNamKyu;

    public List<EmployeeDTONamKyu> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        employeeMapperNamKyu = sqlSession.getMapper(EmployeeMapperNamKyu.class);

        List<EmployeeDTONamKyu> empDTOList = employeeMapperNamKyu.selectAllEmployee();


    }





}
