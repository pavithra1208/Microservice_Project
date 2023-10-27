package com.example.demo.model;

public class Patient {
	private String PatientID;
	private String PatientName;
	private String therapy;
	private Clinician clinician;
	private Admin admin;
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;}
	public Clinician getClinician() {
		return clinician;
	}
	public void setClinician(Clinician clinician) {
		this.clinician = clinician;
	}
		
	
	public String getPatientID() {
		return PatientID;
	}
	public void setPatientID(String patientID) {
		PatientID = patientID;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public String getTherapy() {
		return therapy;
	}
	public void setTherapy(String therapy) {
		this.therapy = therapy;
	}
	public Patient(String patientID, String patientName, String therapy) {
		super();
		PatientID = patientID;
		PatientName = patientName;
		this.therapy = therapy;
	}
	public Patient() {
		super();
	}
	@Override
	public String toString() {
		return "Patient [PatientID=" + PatientID + ", PatientName=" + PatientName + ", therapy=" + therapy + "]";
	}
	
	

}
