package com.upc.demosys.dao;

import com.upc.demosys.model.Retest;

public interface RetestMapper {
    int insert(Retest record);

    int insertSelective(Retest record);
}