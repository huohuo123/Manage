package com.offcn.service.impl;

import com.offcn.mapper.GradeMapper;
import com.offcn.mapper.TeacherMapper;
import com.offcn.pojo.*;
import com.offcn.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hyz
 * @version 1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {

	@Resource
	TeacherMapper teacherMapper;
	@Resource
	GradeMapper gradeMapper;

	@Override
	public int deletes(int[] ids) {
		int rows = 0;
		for (int id : ids) {
			rows += delete(id);
		}
		return rows;
	}

	@Override
	public List<Teacher> getTeacherPager(int pageNO, int size) {
		int skip = (pageNO - 1) * size;
		List<Teacher> teacherList = teacherMapper.getTeacherPager(skip, size);
		for (Teacher teacherInfo : teacherList) {
			if (teacherInfo.getType().equals("0")) {
				teacherInfo.setType("普通教师");
			}
			if (teacherInfo.getType().equals("1")) {
				teacherInfo.setType("金牌教师");
			}
		}
		return teacherList;
	}

	@Override
	public Teacher getTeacherId(int id) {
		return teacherMapper.getTeacherId(id);
	}

	@Override
	public int getTeacherCount() {
		return teacherMapper.getTeacherCount();
	}

	@Override
	public int insert(Teacher entity) {
		return teacherMapper.insert(entity);
	}


	@Override
	public int delete(int id) {
		return teacherMapper.delete(id);
	}

	@Override
	public int update(Teacher entity) {
		return teacherMapper.update(entity);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherMapper.getAllTeacher();
	}

	@Override
	public Teacher loginTea(Teacher tea) {
		return teacherMapper.tealogin(tea);
	}

	@Override
	public List<StudentView> getMystus(int tid) {
		List<StudentView> xxslist = teacherMapper.getxxStudent(tid);
		List<StudentView> bxslist = teacherMapper.getbxStudent(tid);
		List<StudentView> slist = new ArrayList<StudentView>();
		slist.addAll(xxslist);
		slist.addAll(bxslist);
		return slist;
	}

	@Override
	public int insertGrade(Grade grade) {
		return gradeMapper.insertGrade(grade);
	}

	@Override
	public List<CourseExt> getMyCoursesTeacher(int teacherId) {
		return teacherMapper.getMyCoursesTeacher(teacherId);
	}

}
