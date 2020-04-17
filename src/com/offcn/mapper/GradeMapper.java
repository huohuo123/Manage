package com.offcn.mapper;

import com.offcn.pojo.Grade;
import com.offcn.pojo.GradeExt;

import java.util.List;

public interface GradeMapper {

	int insertGrade(Grade grade);

	List<GradeExt> getGradeInfo(Integer studentId);

	List<GradeExt> getGradeInfoTeacher(Integer teacherId);

	int delete(int id);

	GradeExt getGradeId(int id);

	int update(Grade entity);

}