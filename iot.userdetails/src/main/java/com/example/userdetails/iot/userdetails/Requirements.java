package com.example.userdetails.iot.userdetails;

import org.springframework.stereotype.Component;

@ Component

public class Requirements {
	private int userid;
	private String name;
	private String emailid;
	

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

}
