package com.offcn.service;

import java.util.List;

import com.offcn.pojo.Classes;

public interface ClassesService {
	List<Classes> getAllClasses();

	List<Classes> getClassPager(int pageNO, int size);

	Classes getCLassId(int id);

	int getClassesCount();

	int insert(Classes entity);

	int delete(int id);

	int deletes(int[] ids);

	int update(Classes entity);

	Classes getStuByid(int id);

}
