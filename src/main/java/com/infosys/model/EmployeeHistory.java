package com.infosys.model;





import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee_History")
public class EmployeeHistory {
	
	 
	private String employeeId;
	private String employeeName;
	private String emailId;
	private String projectCode;
	private String projectManager;
	private String managerMailId;
	private String escortName;
	private String inTime;
	private String outTime;
	private String reason;
	private String approvedByManager;
	private String dateSubmitted;
	
	
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
	public String getEscortName() {
		return escortName;
	}
	public void setEscortName(String escortName) {
		this.escortName = escortName;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getApprovedByManager() {
		return approvedByManager;
	}
	public void setApprovedByManager(String approvedByManager) {
		this.approvedByManager = approvedByManager;
	}
	public String getDateSubmitted() {
		return dateSubmitted;
	}
	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	
	

}
