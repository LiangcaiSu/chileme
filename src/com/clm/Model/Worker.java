package com.clm.Model;

public class Worker {
	Integer workId;
	String name;
	String position;
	String phoneNumber;
	String email;
	String password;
	Card bankCard = null;
	
	public Worker(Integer workId){
		setWorkId(workId);
	}
	public Worker(Integer workId,String password){
		this.workId = workId;
		this.password = password;
	}
	// get
	public Integer getWorkId() {
		return workId;
	}
	public String getName() {
		return this.name;
	}
	public String getPosition() {
		return this.position;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPassword()
	{
		return this.password;
	}
	// set
	public void setWorkId(Integer id) {
		this.workId=id;
	}
	public void setName(String newName) {
		this.name=newName;
	}
	public void setPosition(String newPosition) {
		this.position=newPosition;
	}
	public void setPhoneNumber(String newPhoneNumber) {
		this.phoneNumber=newPhoneNumber;
	}
	public void setEmail(String newEmail) {
		this.email=newEmail;
	}
	public void setCard(Card card) {
		this.bankCard = card;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
}
