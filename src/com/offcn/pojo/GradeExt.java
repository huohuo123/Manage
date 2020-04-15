package com.offcn.pojo;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 15:42 2020-04-13
 */
public class GradeExt extends Grade{
	private String courseName;
	private String teacherName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
