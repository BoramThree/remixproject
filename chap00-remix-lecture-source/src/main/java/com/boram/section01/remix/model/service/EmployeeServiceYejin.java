package com.boram.section01.remix.model.service;

import com.boram.section01.remix.model.dao.EmployeeMapperYejin;
import com.boram.section01.remix.model.dto.EmployeeDTOYejin;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.boram.section01.remix.common.Template.getSqlSession;

public class EmployeeServiceYejin {

    private EmployeeMapperYejin employeeMapperYejin;

    public List<EmployeeDTOYejin> selectEmpList(Map<String, String> stringStringMap) {

        SqlSession sqlSession = getSqlSession();

        employeeMapperYejin = sqlSession.getMapper(EmployeeMapperYejin.class);
        List<EmployeeDTOYejin> empList = employeeMapperYejin.selectEmpList(stringStringMap);

        return empList;
    }

}
