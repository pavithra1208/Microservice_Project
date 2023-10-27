package com.example.demo.controller;

import java.net.URL;
import java.security.Principal;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SecurityController {
	@GetMapping("/auth")
	public String getRequest(Principal user) {
		return "Welcome to Presidio's medical  web portal";
	}
	
	@GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }
	@GetMapping(value = "/test")  // just for samples 
	  public String getDetails() throws Exception {
	    String body =
	        "<HTML><body> <a href=\"http://localhost:8089/patient/101\">Patient Details</a> </body></HTML>";
	    return (body);

	  }
}
