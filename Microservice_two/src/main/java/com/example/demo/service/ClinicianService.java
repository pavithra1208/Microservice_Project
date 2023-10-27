package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Clinician;

public interface ClinicianService {
	public Clinician getClinicianDetails(String clinicianId);  // methods which are defined in controller
	public String createClincianDetails(Clinician clincian);
	public String updateClincianDetails(Clinician clincian);
	public String deleteClincianDetails(String clinicianId);
	public List<Clinician> getAllClincianDetails();

}
