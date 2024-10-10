package com.boram.section01.remix.model.service;

import com.boram.section01.remix.model.dto.EmployeeDTOKH;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.boram.section01.remix.common.Template.getSqlSession;

public class EmployeeServiceKH {



    public static List<EmployeeDTOKH> selectAllEmployee() {
        SqlSession sqlSession = getSqlSession();


    }
}
