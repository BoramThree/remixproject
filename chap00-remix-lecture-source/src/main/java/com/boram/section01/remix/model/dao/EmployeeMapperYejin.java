package com.boram.section01.remix.model.dao;

import com.boram.section01.remix.model.dto.EmployeeDTOYejin;

import java.util.List;
import java.util.Map;

public interface EmployeeMapperYejin {
    List<EmployeeDTOYejin> selectEmpList(Map<String, String> stringStringMap);
}
