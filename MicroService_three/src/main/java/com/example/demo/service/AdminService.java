package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Admin;

public interface AdminService {
	public Admin getAdmindetails(String AdminID);
	public String createAdmindetails(Admin admin);
	public String updateAdmindetails(Admin admin);
	public String deleteAdmindetails(String AdminID);
	public List<Admin> getAllAdmindetails();
	

}
