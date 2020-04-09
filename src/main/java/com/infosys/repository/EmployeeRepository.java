package com.infosys.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.infosys.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	Employee findByemployeeName(String employeeName);

	Employee findByemployeeId(String employeeId);
	
	Employee findByemailId(String emailId);
	
}
