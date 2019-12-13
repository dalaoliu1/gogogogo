package com.example.demo.model;

public class SysIntroduce {
	int uID;
	String name;
	int phone;
	String email ;
	String personwrite;
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPersonwrite() {
		return personwrite;
	}
	public void setPersonwrite(String personwrite) {
		this.personwrite = personwrite;
	}
	@Override
	public String toString() {
		return "SysIntroduce [uID=" + uID + ", name=" + name + ", phone=" + phone + ", email=" + email
				+ ", personwrite=" + personwrite + ", getuID()=" + getuID() + ", getName()=" + getName()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getPersonwrite()=" + getPersonwrite()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

	

}
