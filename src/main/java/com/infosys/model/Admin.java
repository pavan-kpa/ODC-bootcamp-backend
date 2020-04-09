package com.infosys.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


	@Document(collection = "admin_details")
	public class Admin {
		
		
		@Id
           private String id;     
	
			private String userName;
			private String password;
			
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
		
		

	}