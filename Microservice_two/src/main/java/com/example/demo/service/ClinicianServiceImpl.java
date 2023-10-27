package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Clinician;
import com.example.demo.repository.ClinicianRepository;

@Service
public class ClinicianServiceImpl implements ClinicianService{
	
	ClinicianRepository clinicianRepository;
	

	public ClinicianServiceImpl(ClinicianRepository clinicianRepository) {
		this.clinicianRepository = clinicianRepository;
	}

	@Override
	public Clinician getClinicianDetails(String clinicianId) {
		
		return clinicianRepository.findById(clinicianId).get();
	}

	@Override
	public String createClincianDetails(Clinician clinician) {
		clinicianRepository.save(clinician);
		return "created successfully";
	}

	@Override
	public String updateClincianDetails(Clinician clinician) {
		clinicianRepository.save(clinician);
		return "updated successfully";
	}

	@Override
	public String deleteClincianDetails(String clinicianId) {
		clinicianRepository.deleteById(clinicianId);
		return "deleted successfully";
	}

	@Override
	public List<Clinician> getAllClincianDetails() {
		return clinicianRepository.findAll();
	}

}
