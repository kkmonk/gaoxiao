package com.upc.demosys.dao;

import com.upc.demosys.model.College;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashSet;
import java.util.List;

@Mapper
public interface CollegeMapper {
    int deleteByPrimaryKey(String coId);

    int insert(College record);

    int insertSelective(College record);

    College selectByPrimaryKey(/*@Param("coId") */String coId);

    List<College> selectAllCollege();//mybatis返回的是一个ArrayList

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}