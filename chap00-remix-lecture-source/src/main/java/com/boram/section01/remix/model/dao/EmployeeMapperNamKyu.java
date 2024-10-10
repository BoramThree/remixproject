package com.boram.section01.remix.model.dao;

import com.boram.section01.remix.model.dto.EmployeeDTONamKyu;

import java.util.List;

public interface EmployeeMapperNamKyu {

    List<EmployeeDTONamKyu> selectAllEmployee();

    EmployeeDTONamKyu selectEmployeeByBonus(int empId);
}
