package com.cg.pojo;

public class RegistrationDetails {

	private String firstname;
	private String lastName;
	private String emailId;
	private int mobileNo;
	private String userName;
	private String password;

	public RegistrationDetails() {

	}

	public RegistrationDetails(String firstname, String lastName, String emailId, int mobileNo, String userName,
			String password) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.userName = userName;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

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

	@Override
	public String toString() {
		return "RegistrationDetails [firstname=" + firstname + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", userName=" + userName + ", password=" + password + "]";
	}

}