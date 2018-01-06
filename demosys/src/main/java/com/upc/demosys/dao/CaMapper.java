package com.upc.demosys.dao;

import com.upc.demosys.model.Ca;

public interface CaMapper {
    int insert(Ca record);

    int insertSelective(Ca record);
}