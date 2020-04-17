package com.offcn.service;

import java.util.List;

import com.offcn.pojo.Course;
import com.offcn.pojo.CtcKey;

public interface CourseService {

	List<Course> getCoursePager(int pageNO, int size);

	Course getCourseId(int id);

	int getCourseCount();

	int insert(Course entity);

	int delete(int id);

	int update(Course entity);

	int deletes(int[] ids);

	void insertBatch(List<CtcKey> ctclist);


}
