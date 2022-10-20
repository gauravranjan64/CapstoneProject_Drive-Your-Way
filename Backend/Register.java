package com.springRest.RestApi.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="registered_customer")
public class Register {
	private String Name;
	private String email;
	@Id
	private int contactNumber;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String name, String email, int contactNumber) {
		super();
		Name = name;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Register [Name=" + Name + ", email=" + email + ", contactNumber=" + contactNumber + "]";
	}
	
}
