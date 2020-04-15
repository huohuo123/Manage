package com.offcn.mapper;

import com.offcn.pojo.Grade;
import com.offcn.pojo.GradeExt;

import java.util.List;

public interface GradeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
    
    int insertGrade(Grade grade);

    List<GradeExt> getGradeInfo(Integer studentId);
    
}