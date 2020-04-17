package com.offcn.service;

import com.offcn.pojo.CourseExt;
import com.offcn.pojo.Grade;
import com.offcn.pojo.StudentView;
import com.offcn.pojo.Teacher;

import java.util.List;

public interface TeacherService {

	List<Teacher> getTeacherPager(int pageNO, int size);

	Teacher getTeacherId(int id);

	int getTeacherCount();

	int insert(Teacher entity);

	int delete(int id);

	int update(Teacher entity);

	int deletes(int[] ids);

	List<Teacher> getAllTeacher();

	Teacher loginTea(Teacher tea);

	List<StudentView> getMystus(int tid);

	int insertGrade(Grade grade);

	List<CourseExt> getMyCoursesTeacher(int teacherId);

}
