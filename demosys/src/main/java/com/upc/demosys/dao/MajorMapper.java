package com.upc.demosys.dao;

import com.upc.demosys.model.Major;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MajorMapper {
    int deleteByPrimaryKey(String mId);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(String mId);

    List<Major> selectALLMajor();
    List<Major> selectByCoID(String coid);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}