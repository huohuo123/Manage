package com.offcn.mapper;

import java.util.List;

import com.offcn.pojo.CourseExt;
import com.offcn.pojo.Student;
import org.apache.ibatis.annotations.Param;

import com.offcn.pojo.Classes;
import com.offcn.pojo.Course;

public interface CourseMapper {
	int insert(Course record);

	List<Course> getCoursePager(@Param("skip") int skip, @Param("size") int size);

	Course getCourseId(int id);

	int getCourseCount();

	int delete(int id);

	int update(Course entity);

	List<CourseExt> getBxCourse(Course course);

	//public List<CourseExt> getMyCourse(int id);


}