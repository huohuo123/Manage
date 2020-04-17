package com.offcn.mapper;

import com.offcn.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
	int insert(Course record);

	List<Course> getCoursePager(@Param("skip") int skip, @Param("size") int size);

	Course getCourseId(int id);

	int getCourseCount();

	int delete(int id);

	int update(Course entity);

	// List<CourseExt> getBxCourse(Course course);

	//public List<CourseExt> getMyCourse(int id);


}