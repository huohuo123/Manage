package com.offcn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.offcn.mapper.CourseMapper;
import com.offcn.mapper.CtcMapper;
import com.offcn.pojo.Course;
import com.offcn.pojo.CtcKey;
import com.offcn.service.CourseService;

/**
 * @author hyz
 * @version 1.0
 */
@Service
public class CourseServiceImpl implements CourseService {

	@Resource
	CourseMapper courseMapper;

	@Resource
	CtcMapper ctcMapper;


	@Override
	public int deletes(int[] ids) {
		int rows = 0;
		for (int id : ids) {
			rows += delete(id);
		}
		return rows;
	}


	@Override
	public List<Course> getCoursePager(int pageNO, int size) {
		int skip = (pageNO - 1) * size;
		return courseMapper.getCoursePager(skip, size);
	}


	@Override
	public Course getCourseId(int id) {
		return courseMapper.getCourseId(id);
	}


	@Override
	public int getCourseCount() {
		return courseMapper.getCourseCount();
	}


	@Override
	public int insert(Course entity) {
		return courseMapper.insert(entity);
	}


	@Override
	public int delete(int id) {
		return courseMapper.delete(id);
	}


	@Override
	public int update(Course entity) {
		return courseMapper.update(entity);
	}

	@Override
	public void insertBatch(List<CtcKey> ctclist) {
		ctcMapper.insertBatch(ctclist);
	}

	/*
	 * @see com.offcn.service.CourseService#getMyCourse(int)
	 */
	/*@Override
	public List<CourseExt> getMyCourse(int id) {
		// TODO Auto-generated method stub
		return courseMapper.getMyCourse(id);
	}*/


}
