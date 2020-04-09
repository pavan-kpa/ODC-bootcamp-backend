package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Admin;
import com.infosys.repository.AdminRepository;

@RestController
public class AdminController {
	@Autowired
	private AdminRepository repository;

	@GetMapping("/adminodc")
	public List<Admin> getAllAdmin() {

		return repository.findAll();
	}
}