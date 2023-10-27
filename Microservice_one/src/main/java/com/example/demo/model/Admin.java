package com.example.demo.model;

public class Admin {
	private String adminID;
	private String adminDep;
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getAdminDep() {
		return adminDep;
	}
	public void setAdminDep(String adminDep) {
		this.adminDep = adminDep;
	}
	public Admin(String adminID, String adminDep) {
		super();
		this.adminID = adminID;
		this.adminDep = adminDep;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminDep=" + adminDep + "]";
	}
	
	

}

