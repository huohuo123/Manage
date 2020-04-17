package com.offcn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.offcn.pojo.Classes;

public interface ClassesMapper {

	int insert(Classes record);

	List<Classes> getAllClasses();

	List<Classes> getClassPager(@Param("skip") int skip, @Param("size") int size);

	Classes getCLassId(int id);

	int getClassesCount();

	int delete(int id);

	int update(Classes entity);

	Classes getStuByid(int id);

}