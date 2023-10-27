package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	AdminService adminService;
	
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}

	@GetMapping("/{adminID}")
	public Admin getAdmindetails(@PathVariable("adminID") String adminID ) {
		return adminService.getAdmindetails(adminID);
	}
	@PostMapping()
	public String createAdmindetails(@RequestBody Admin admin) {
		adminService.createAdmindetails(admin);
		return "created admin successfully";
		
	}
	@PutMapping()
	public String updateAdmindetails(@RequestBody Admin admin) {
		adminService.updateAdmindetails(admin);
		return "updated admin successfully";
	}
	@DeleteMapping()
	public String deleteAdmindetails(@PathVariable("adminID") String adminID) {
		adminService.deleteAdmindetails(adminID);
		return "deleted admin successfully";
		
	}
	@GetMapping()
	public List<Admin> getAllAdmindetails(){
		return adminService.getAllAdmindetails();
	}
}
