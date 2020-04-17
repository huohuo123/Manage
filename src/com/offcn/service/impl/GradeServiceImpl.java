package com.offcn.service.impl;

import com.offcn.mapper.GradeMapper;
import com.offcn.pojo.Grade;
import com.offcn.pojo.GradeExt;
import com.offcn.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:hyz
 * @Description:
 * @Date: Create in 09:48 2020-04-17
 */
@Service
public class GradeServiceImpl implements GradeService {

	@Resource
	GradeMapper gradeMapper;

	@Override
	public List<GradeExt> getGradeInfo(Integer studentId) {
		List<GradeExt> gradeList = gradeMapper.getGradeInfo(studentId);
		return gradeList;
	}

	@Override
	public List<GradeExt> getGradeInfoTeacher(Integer teacherId) {
		List<GradeExt> gradeExts=gradeMapper.getGradeInfoTeacher(teacherId);
		return gradeExts;
	}

	@Override
	public int deletes(int[] ids) {
		int rows=0;
		for (int id : ids) {
			rows+=delete(id);
		}
		return rows;
	}

	@Override
	public GradeExt getGradeId(Integer id) {
		GradeExt gradeExt= gradeMapper.getGradeId(id);
		return gradeExt;
	}

	@Override
	public int update(Grade entity) {
		Grade grade=gradeMapper.getGradeId(entity.getId());
		double pgrade=grade.getPgrade();
		double kgrade=grade.getKgrade();
		if (null!=entity.getPgrade()){
			pgrade=entity.getPgrade();
		}
		if (null!=entity.getKgrade()){
			kgrade=entity.getKgrade();
		}
		entity.setZgrade(pgrade+kgrade);
		return gradeMapper.update(entity);
	}


	@Override
	public int delete(int id) {
		return gradeMapper.delete(id);
	}


}
