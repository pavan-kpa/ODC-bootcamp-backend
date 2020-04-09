package com.infosys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infosys.model.Admin;

public interface AdminRepository extends MongoRepository<Admin, String>{

	Admin findByuserName(String userName);

	Admin findBypassword(String password);
	
	
}