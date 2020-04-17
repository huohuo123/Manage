package com.offcn.mapper;

import com.offcn.pojo.CtcKey;

import java.util.List;

public interface CtcMapper {

	void insertBatch(List<CtcKey> ctclist);
}