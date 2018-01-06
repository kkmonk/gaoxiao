package com.upc.demosys.dao;

import com.upc.demosys.model.Punishment;

public interface PunishmentMapper {
    int deleteByPrimaryKey(String pId);

    int insert(Punishment record);

    int insertSelective(Punishment record);

    Punishment selectByPrimaryKey(String pId);

    int updateByPrimaryKeySelective(Punishment record);

    int updateByPrimaryKeyWithBLOBs(Punishment record);

    int updateByPrimaryKey(Punishment record);
}