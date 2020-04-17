package com.offcn.service;

import com.offcn.pojo.*;

import java.util.List;

public interface StudentService {
	List<Student> getStudentPager(int pageNO, int size);

	int getCount();

	int deleteByPrimaryKey(Integer id);

	int multiDelete(int[] ids);

	int insert(Student record);

	Student selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(Student record);

	List<StudentExt> getStuByCid(int id);

	Student stulogin(Student student);

	List<CourseExt> getXuxiu(int classid);

	int inserBatch(List<Sc> sclist);

	List<CourseExt> getMycourses(int classid, int stuid);

	int modifyPassword(Student entity,int stuid);



}
