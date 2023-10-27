package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserCredentials;


public interface UserCredentialsRepo extends JpaRepository<UserCredentials, Integer> {
	Optional<UserCredentials> findByUserName(String UserName);


}
