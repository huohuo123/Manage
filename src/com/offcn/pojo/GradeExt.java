package com.offcn.pojo;

/**
 * @Author:hyz
 * @Description:
 * @Date: Create in 15:42 2020-04-13
 */
public class GradeExt extends Grade {
	private String courseName;
	private String teacherName;
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

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
