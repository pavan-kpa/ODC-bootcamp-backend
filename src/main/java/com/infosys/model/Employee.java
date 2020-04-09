package com.infosys.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee_Details")
public class Employee {

	
	private String employeeId;
	private String employeeName;
	private String emailId;
	private String projectCode;
	private String projectManager;
	private String managerMailId;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getManagerMailId() {
		return managerMailId;
	}
	public void setManagerMailId(String managerMailId) {
		this.managerMailId = managerMailId;
	}
	
	
}
