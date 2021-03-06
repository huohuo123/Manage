package com.offcn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.offcn.mapper.ClassesMapper;
import com.offcn.mapper.StudentMapper;
import com.offcn.pojo.Classes;
import com.offcn.service.ClassesService;

/**
 * @author hyz
 * @version 1.0
 */
@Service
public class ClassesServiceImpl implements ClassesService {

	@Resource
	ClassesMapper classesMapper;

	@Override
	public List<Classes> getAllClasses() {

		return classesMapper.getAllClasses();
	}

	@Override
	public List<Classes> getClassPager(int pageNO, int size) {

		int skip = (pageNO - 1) * size;
		List<Classes> classList = classesMapper.getClassPager(skip, size);
		for (Classes classes : classList) {
			if (classes.getType().equals("0")) {
				classes.setType("普通班");
			}
			if (classes.getType().equals("1")) {
				classes.setType("实验班");
			}
		}
		return classList;
	}

	@Override
	public Classes getCLassId(int id) {

		return classesMapper.getCLassId(id);
	}

	@Override
	public int getClassesCount() {

		return classesMapper.getClassesCount();
	}

	@Override
	public int insert(Classes entity) {

		return classesMapper.insert(entity);
	}

	@Override
	public int delete(int id) {

		int row = classesMapper.delete(id);
		return row;
	}

	@Override
	public int deletes(int[] ids) {
		// TODO Auto-generated method stu
		int rows = 0;
		for (int id : ids) {
			rows += delete(id);
		}
		return rows;
	}

	@Override
	public int update(Classes entity) {

		return classesMapper.update(entity);
	}

	@Override
	public Classes getStuByid(int id) {

		return classesMapper.getStuByid(id);
	}

}
