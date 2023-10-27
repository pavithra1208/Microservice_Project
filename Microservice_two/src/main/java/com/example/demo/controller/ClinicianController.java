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

import com.example.demo.model.Clinician;
import com.example.demo.service.ClinicianService;

@RestController
@RequestMapping("/clinician")
public class ClinicianController {
	ClinicianService clinicianService;

	public ClinicianController(ClinicianService clinicianService) {
		this.clinicianService = clinicianService;
	}

	@GetMapping("/{clinicianId}")
	public Clinician getClinicianDetails(@PathVariable("clinicianId") String clinicianId ) {
		return clinicianService.getClinicianDetails(clinicianId);

	}
	
	@PostMapping()
	public String createClinicianDetails(@RequestBody Clinician clinician) {
		clinicianService.createClincianDetails(clinician);
		return "created Clinician succussfully";	
	}
	@PutMapping()
	public String updateClinicianDetails(@RequestBody Clinician clinician) {
		clinicianService.updateClincianDetails(clinician);
		return "updated Clinician succussfully";	
	}
	@DeleteMapping()
	public String deleteClinicianDetails(@PathVariable("clinicianId") String clinicianId ) {
		clinicianService.deleteClincianDetails(clinicianId);
		return "deleted Clinician succussfully";	
	}
	@GetMapping()
	public List<Clinician> getAllClincianDetails(){
		return clinicianService.getAllClincianDetails();
	}

}
