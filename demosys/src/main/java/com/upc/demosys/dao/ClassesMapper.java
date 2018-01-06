package com.upc.demosys.dao;

import com.upc.demosys.model.Classes;

public interface ClassesMapper {
    int deleteByPrimaryKey(Integer clId);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer clId);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}