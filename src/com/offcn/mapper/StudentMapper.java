package com.offcn.mapper;

import com.offcn.pojo.CourseExt;
import com.offcn.pojo.Student;
import com.offcn.pojo.StudentExt;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Student record);

	Student selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(Student record);

	List<Student> getStudentPager(@Param("skip") int skip, @Param("size") int size);

	int getCount();

	List<StudentExt> getStuByCid(int id);

	Student stulogin(Student student);

	List<CourseExt> getXuxiu(int classid);

	List<CourseExt> getBxCourse(Student studentInfo);

	List<CourseExt> getxxCourse(int stuid);

}