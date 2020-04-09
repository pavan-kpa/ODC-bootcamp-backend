package com.infosys.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.infosys.model.EmployeeHistory;

public interface EmployeeHistoryRepository extends MongoRepository<EmployeeHistory, String> {

	EmployeeHistory findByemployeeId(String employeeId);

	List<EmployeeHistory> findBydateSubmitted(String dateSubmitted);

	
	@Query("{'dateSubmitted' : { $gte: ?0, $lte: ?1 } }")                 
	public List<EmployeeHistory> getByDate(String fromDate, String endDate);
	

}