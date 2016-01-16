package app.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import app.repository.commons.Common;

@Document
public class User extends Common implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2312800478329505351L;
	@Id
	private String id;
	private String name;
	private String surname;
	private String passportNum;
	private String address;
	private String phoneNum;
	private String email;
	
		
	public User() {
		super();
	}

	
	public User(String name, String surname, String passportNum, String address, String phoneNum, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.passportNum = passportNum;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}


	//@Override
	public String getId() {
		return id;
	}
	
//	@Override
	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPassportNum() {
		return passportNum;
	}


	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", passportNum=" + passportNum
				+ ", address=" + address + ", phoneNum=" + phoneNum + ", email=" + email + "]";
	}


	
	
}
