package com.offcn.service.impl;

import com.offcn.mapper.GradeMapper;
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
}
