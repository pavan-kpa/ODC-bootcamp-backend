package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Admin;
import com.infosys.repository.AdminRepository;


@RestController

public class AdminloginController {

	@Autowired
	private AdminRepository repository;

	
	@GetMapping("/adminLogin/{username}&{password}")
	
	public String adminLogin(@PathVariable String username ,@PathVariable String password ) {

		Admin sec = repository.findByuserName(username);
		Admin pwd = repository.findBypassword(password);

		if (sec != null && pwd !=null) {

		return "Login Successfull";

		}

		else {
			return "Login Fail";

		}
			
	}
}
