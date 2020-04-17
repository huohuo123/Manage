package com.offcn.service;

import com.offcn.pojo.GradeExt;

import java.util.List;

/**
 * @Author:hyz
 * @Description:
 * @Date: Create in 09:49 2020-04-17
 */
public interface GradeService {

	List<GradeExt> getGradeInfo(Integer studentId);
}
