package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Security;
import com.infosys.repository.SecurityRepository;

@RestController

public class SecurityloginController {

	@Autowired
	private SecurityRepository repository;

	
	@GetMapping("/securityLogin/{username}&{password}")
	
	public String securityLogin(@PathVariable String username ,@PathVariable String password ) {

		Security sec = repository.findByUsername(username);
		Security pwd = repository.findBypassword(password);

		if (sec != null && pwd !=null) {

		return "Login Successfull";

		}

		else {
			return "Login Fail";

		}
			
	}
}
