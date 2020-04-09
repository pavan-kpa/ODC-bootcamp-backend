package com.infosys.controller;


import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.EmployeeHistory;
import com.infosys.repository.EmployeeHistoryRepository;

@RestController
public class EmployeeHistoryController {

	@Autowired
	private EmployeeHistoryRepository repository;

	@PostMapping("/empHistory")
	public String saveempHistory(@RequestBody EmployeeHistory emp) {
		repository.save(emp);
		return "Employee saved with " + emp.getEmployeeId();
	}
	
	@GetMapping("/empHis")
	public List<EmployeeHistory> empHi(){
		return repository.findAll();
		
	}
	
	@GetMapping("/getempHis/{employeeId}")
	public EmployeeHistory getByEmployeeid(@PathVariable String employeeId){
		return repository.findByemployeeId(employeeId);
		
	}
	
	@GetMapping("/getempdate/{dateSubmitted}")
	public  List<EmployeeHistory> getBydateSubmitted(@PathVariable String dateSubmitted , Sort s){
		return repository.findBydateSubmitted(dateSubmitted);
		
	}
	
	@GetMapping("/getempbydate/{fromDate}&{endDate}")
	public  List<EmployeeHistory> getBydateSubmit(@PathVariable String fromDate, @PathVariable String endDate){
		return repository.getByDate(fromDate, endDate);
		
 
	}


	
	@PutMapping("/updatedempHis/{employeeId}")
	public String updateEmployee(@PathVariable String employeeId, @RequestBody EmployeeHistory emphis) {
		repository.save(emphis);
		return "Employee updated with " + emphis.getEmployeeId();
		
	}
	
	@DeleteMapping("/delEmp/{employeeId}")
	public String deleteEmployee(@PathVariable String employeeId) {
		repository.deleteById(employeeId);
		return "Employee deleted with " + employeeId;
		}
	

};






