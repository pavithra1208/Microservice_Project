package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Clinician;

public interface ClinicianRepository extends JpaRepository<Clinician, String> {

}
