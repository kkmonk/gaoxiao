package com.upc.demosys.dao;

import com.upc.demosys.model.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String cid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}