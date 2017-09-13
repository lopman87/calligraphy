package com.shufa.dbModel;

import java.io.Serializable;

public class AdminUserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adminName;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	private String adminPwd;
}
