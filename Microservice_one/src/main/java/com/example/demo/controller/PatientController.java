package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Admin;
import com.example.demo.model.Clinician;
import com.example.demo.model.Patient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/patient")
public class PatientController {
public static final String PATIENT_SERVICE = "patient-service";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/{PatientID}")
	@CircuitBreaker(name=PATIENT_SERVICE, fallbackMethod ="patientServiceFallBack")
	public Patient getPatient(@PathVariable("PatientID") String PatientID ) {
		Patient patient = new Patient("101","pavi","diagonsis for backpain");
		
		//RestTemplate restTemplate = new RestTemplate(); //autowired & injected obj which is created in Main class
		Clinician clinician = restTemplate.getForObject("http://localhost:8081/clinician/dr.riya", Clinician.class);
		patient.setClinician(clinician);
		
		Admin admin = restTemplate.getForObject("http://localhost:8082/admin/a1", Admin.class);
		patient.setAdmin(admin);
		
		return patient;
	}
	
	public Patient patientServiceFallBack(Exception patientException) {
		return new Patient("000","dummy","dummy");
		
	}

}
