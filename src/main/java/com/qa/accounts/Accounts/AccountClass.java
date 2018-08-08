package com.qa.accounts.Accounts;

public class AccountClass {
	

	
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public AccountClass(String firstName, String lastName, String accountNumber) {
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAccountNumber(accountNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	

	

	
	
	

}
