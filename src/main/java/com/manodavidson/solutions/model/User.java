package com.manodavidson.solutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String invocationDate;
	private String invocationTime;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInvocationDate() {
		return invocationDate;
	}

	public void setInvocationDate(String invocationDate) {
		this.invocationDate = invocationDate;
	}

	public String getInvocationTime() {
		return invocationTime;
	}

	public void setInvocationTime(String invocationTime) {
		this.invocationTime = invocationTime;
	}

	@Override
	public String toString() {
		return " {\"userId\":"+ "\""+ getUserId()+ "\""+", "+"\"userName\":"+ "\""+getUserName()+ "\""+", "+"\"invocationDate\": "+ "\""+getInvocationDate()+ "\""+", "+"\"invocationTime\":"+"\""+getInvocationTime()+"\"}";
	}

}
