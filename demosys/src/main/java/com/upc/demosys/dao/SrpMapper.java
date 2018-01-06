package com.upc.demosys.dao;

import com.upc.demosys.model.Srp;

public interface SrpMapper {
    int insert(Srp record);

    int insertSelective(Srp record);
}