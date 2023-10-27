package com.example.demo.model;

public class Clinician {
	private String clinicianName;
	private String clinicianassgined;
	private String clinicianId;
	public Clinician() {
		super();
	}
	public Clinician(String clinicianName, String clinicianassgined, String clinicianId) {
		this.clinicianName = clinicianName;
		this.clinicianassgined = clinicianassgined;
		this.clinicianId = clinicianId;
	}
	public String getClinicianId() {
		return clinicianId;
	}
	public void setClinicianId(String clinicianId) {
		this.clinicianId = clinicianId;
	}
	
	public String getClinicianName() {
		return clinicianName;
	}
	public void setClinicianName(String clinicianName) {
		this.clinicianName = clinicianName;
	}
	public String getClinicianassgined() {
		return clinicianassgined;
	}
	public void setClinicianassgined(String clinicianassgined) {
		this.clinicianassgined = clinicianassgined;
	}
	
	@Override
	public String toString() {
		return "Clinician [clinicianName=" + clinicianName + ", clinicianassgined=" + clinicianassgined
				+ ", clinicianId=" + clinicianId + "]";
	}
	
	
	

}
