package com.aspire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aspire.entity.Users;
import com.aspire.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		return service.register(user);

	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Users user) {
		String token = service.verify(user);
		if ("fail".equals(token)) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}
		return ResponseEntity.ok(token);
	}

}
