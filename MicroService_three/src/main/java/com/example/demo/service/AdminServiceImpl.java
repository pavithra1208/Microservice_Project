package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
	AdminRepository adminRepository;
	

	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public Admin getAdmindetails(String AdminID) {
		return adminRepository.findById(AdminID).get();
	}

	@Override
	public String createAdmindetails(Admin admin) {
		adminRepository.save(admin);
		return "created successfully";
	}

	@Override
	public String updateAdmindetails(Admin admin) {
		adminRepository.save(admin);
		return "updated successfully";
	}

	@Override
	public String deleteAdmindetails(String AdminID) {
		adminRepository.deleteById(AdminID);
		return "deleted successfully";
	}

	@Override
	public List<Admin> getAllAdmindetails() {
		
		return adminRepository.findAll();
	}

	
}
