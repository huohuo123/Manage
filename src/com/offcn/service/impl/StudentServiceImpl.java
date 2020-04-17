package com.offcn.service.impl;

import com.offcn.mapper.ScMapper;
import com.offcn.mapper.StudentMapper;
import com.offcn.pojo.*;
import com.offcn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author hyz
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	StudentMapper studentMapper;

	@Resource
	ScMapper scMapper;

	@Override
	public List<Student> getStudentPager(int pageNO, int size) {
		int skip = (pageNO - 1) * size;
		return studentMapper.getStudentPager(skip, size);
	}

	@Override
	public int getCount() {
		return studentMapper.getCount();
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int multiDelete(int[] ids) {
		int rows = 0;
		for (int id : ids) {
			rows += deleteByPrimaryKey(id);
		}
		return rows;
	}

	@Override
	public int insert(Student record) {
		return studentMapper.insert(record);
	}

	@Override
	public Student selectByPrimaryKey(Integer id) {
		return studentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		return studentMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<StudentExt> getStuByCid(int id) {
		return studentMapper.getStuByCid(id);
	}

	@Override
	public Student stulogin(Student student) {
		return studentMapper.stulogin(student);
	}

	@Override
	public List<CourseExt> getXuxiu(int classid) {
		// TODO Auto-generated method stub
		return studentMapper.getXuxiu(classid);
	}

	@Override
	public int inserBatch(List<Sc> sclist) {
		return scMapper.inserBatch(sclist);
	}

	@Override
	public List<CourseExt> getMycourses(int classid, int stuid) {
		Student studentInfo = new Student();
		studentInfo.setId(stuid);
		studentInfo.setClassid(classid);
		List<CourseExt> bxlist = studentMapper.getBxCourse(studentInfo);
		List<CourseExt> xxlist = studentMapper.getxxCourse(stuid);
		List<CourseExt> ctlist = new ArrayList<CourseExt>();
		ctlist.addAll(bxlist);
		ctlist.addAll(xxlist);
		return ctlist;
	}



}
