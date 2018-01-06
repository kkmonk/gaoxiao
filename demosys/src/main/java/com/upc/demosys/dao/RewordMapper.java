package com.upc.demosys.dao;

import com.upc.demosys.model.Reword;

public interface RewordMapper {
    int deleteByPrimaryKey(String rId);

    int insert(Reword record);

    int insertSelective(Reword record);

    Reword selectByPrimaryKey(String rId);

    int updateByPrimaryKeySelective(Reword record);

    int updateByPrimaryKey(Reword record);
}