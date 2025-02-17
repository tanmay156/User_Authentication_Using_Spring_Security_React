package com.aspire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.aspire.entity.Users;
import com.aspire.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private JWTService jwtService;
	
	@Autowired
	AuthenticationManager authmanager;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
	
	
	public Users register(Users user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		return repository.save(user);

	}


	public String verify(Users user) {
		Authentication authentication = 
				authmanager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(authentication.isAuthenticated())
			return jwtService.generateToken(user.getUsername());
		
		return "fail";
	}
}
