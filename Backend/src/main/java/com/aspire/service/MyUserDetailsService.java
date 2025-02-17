package com.aspire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aspire.entity.UserPrincipal;
import com.aspire.entity.Users;
import com.aspire.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repository.findByUsername(username);

		if (user == null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("User not found");
		}

		return new UserPrincipal(user);
	}

}
