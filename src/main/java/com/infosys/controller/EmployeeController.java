package com.infosys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Employee;
import com.infosys.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/empDetail")
	public String saveempDetail(@RequestBody Employee emp) {
		repository.save(emp);
		return "Employee " + emp.getEmployeeName() + "  saved with " + emp.getEmployeeId();
	}

	@GetMapping("/empodc")
	public List<Employee> getAllEmp() {

		return repository.findAll();
	}

	@GetMapping("/getEmp/{employeeName}")
	public Employee getByEmployeename(@PathVariable String employeeName) {
		return repository.findByemployeeName(employeeName);

	}

	@GetMapping("/getempid/{employeeId}")
	public Employee getByEmployeeid(@PathVariable String employeeId) {
		return repository.findByemployeeId(employeeId);

	}

	@GetMapping("/getempemail/{emailId}")
	public Employee getByEmailid(@PathVariable String emailId) {
		return repository.findByemailId(emailId);

	}
}