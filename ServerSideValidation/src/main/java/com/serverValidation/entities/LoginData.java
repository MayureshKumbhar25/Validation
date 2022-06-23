package com.serverValidation.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	@NotBlank(message = "User name cannot be empty..")
	@Size(min = 3, max = 12, message = "User name must be between 3 - 12 characters !!")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="invalid email !!")
	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LoginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
  
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

}
