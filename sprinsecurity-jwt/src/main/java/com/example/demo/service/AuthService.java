package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserCredentials;
import com.example.demo.repo.UserCredentialsRepo;

@Service
public class AuthService {
	
	@Autowired
	private UserCredentialsRepo userCredentialsRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	JwtService jwtService;
	
	public String saveUser(UserCredentials userCredentials) {
		userCredentials.setPassword(passwordEncoder.encode(userCredentials.getPassword()));
		userCredentialsRepo.save(userCredentials);
		return "user added to the system";
	}

	public String generateToken(String userName) {
		return jwtService.generateToken(userName);
	}

	public void validateToken(String token) {
		jwtService.validateToken(token);
	}


}
