package com.boram.section01.remix.model.service;

import com.boram.section01.remix.model.dao.EmployeeMapper;
import com.boram.section01.remix.model.dao.EmployeeMapperMoon;
import com.boram.section01.remix.model.dto.EmployeeDTOMoon;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.boram.section01.remix.common.Template.getSqlSession;

public class EmployeeServiceMoon {

    private EmployeeMapperMoon employeeMapperMoon;

    public List<EmployeeDTOMoon> selectAllEmployee() {


        SqlSession sqlSession = getSqlSession();


        employeeMapperMoon = sqlSession.getMapper(EmployeeMapperMoon.class);

        List<EmployeeDTOMoon> employeeList = employeeMapperMoon.selectAllMenu();


        sqlSession.close();

        return employeeList;
    }


}
