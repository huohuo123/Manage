package com.offcn.mapper;

import com.offcn.pojo.CourseExt;
import com.offcn.pojo.StudentView;
import com.offcn.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

	int insert(Teacher record);

	List<Teacher> getTeacherPager(@Param("skip") int skip, @Param("size") int size);

	Teacher getTeacherId(int id);

	int getTeacherCount();

	int delete(int id);

	int update(Teacher entity);

	List<Teacher> getAllTeacher();

	Teacher tealogin(Teacher teacher);

	List<StudentView> getxxStudent(int tid);

	List<StudentView> getbxStudent(int tid);

	List<CourseExt> getMyCoursesTeacher(int teacherId);


}