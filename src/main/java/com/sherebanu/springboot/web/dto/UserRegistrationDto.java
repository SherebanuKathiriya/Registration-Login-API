package com.sherebanu.springboot.web.dto;


public class UserRegistrationDto {

	private String name;
	private String address;
	private String email;
	private String dob;
	private String username;
	private String password;
	
	public UserRegistrationDto(String name, String address, String email, String dob, String username, String password) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}
	public UserRegistrationDto() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
