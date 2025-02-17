package com.aspire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspire.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	Users findByUsername(String username);
}
