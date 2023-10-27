package com.example.demo.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entity.UserCredentials;
import com.example.demo.repo.UserCredentialsRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserCredentialsRepo userCredentialsRepo;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<UserCredentials> userCredentials = userCredentialsRepo.findByUserName(userName);
		 return userCredentials.map(CustomUserDetails::new).orElseThrow(()-> new UsernameNotFoundException(userName));
    }

}
