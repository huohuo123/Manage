package com.offcn.pojo;

/**
 * @author hyz
 * @version 1.0
 */
public class CourseExt extends Course {
	/**
	 * 教师姓名
	 */
	private String tname;
	/**
	 * 教师的主键
	 */
	private Integer tId;
	/**
	 * 班级名称
	 */
	private String className;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

}
