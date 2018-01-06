package com.upc.demosys.dao;

import com.upc.demosys.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String aname);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String aname);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}