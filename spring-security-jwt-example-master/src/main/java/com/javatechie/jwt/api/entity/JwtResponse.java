package com.javatechie.jwt.api.entity;



/**
 * This is model class which is used as a response when a successful validation
 * of token happens which contains fields like UserId, UserName and if the user
 * is valid or not.
 */


public class JwtResponse {

	private String id;

	private String username;

	private boolean isValid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public JwtResponse(String id, String username, boolean isValid) {
		super();
		this.id = id;
		this.username = username;
		this.isValid = isValid;
	}

	public JwtResponse() {
		super();
	}

	@Override
	public String toString() {
		return "JwtResponse [id=" + id + ", username=" + username + ", isValid=" + isValid + "]";
	}
	
	
	
	

	
	
}
