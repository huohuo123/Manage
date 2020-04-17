package com.offcn.pojo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @Author:HuoYaJing
 * @Description:
 * @Date: Create in 10:26 2020-04-17
 */
public class StudentModify extends Student{
	@NotNull
	@Length(min=6,max=12,message="密码长度不正确，得在6-12之间")
	private String passwordold;

	@NotNull
	@Length(min=6,max=12,message="密码长度不正确，得在6-12之间")
	private String passwordnew;

	public String getPasswordold() {
		return passwordold;
	}

	public void setPasswordold(String passwordold) {
		this.passwordold = passwordold;
	}

	public String getPasswordnew() {
		return passwordnew;
	}

	public void setPasswordnew(String passwordnew) {
		this.passwordnew = passwordnew;
	}
}
