package com.upc.demosys.dao;

import com.upc.demosys.model.Relearn;

public interface RelearnMapper {
    int insert(Relearn record);

    int insertSelective(Relearn record);
}