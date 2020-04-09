package com.infosys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infosys.model.Security;

public interface SecurityRepository extends MongoRepository<Security, String>{
	
	Security findByUsername(String username);

	Security findBypassword(String password);
	
}