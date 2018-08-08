package com.qa.accounts.Accounts;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServiceClass {
	
	
	
	private HashMap<Integer, AccountClass> hmap  = new HashMap<Integer, AccountClass>();
	private int newID = 0;
	
	public void addNewAcc(String firstName, String lastName, String accountNumber) {
		
	AccountClass account = new AccountClass(firstName, lastName, accountNumber);
	
	hmap.put(newID, account);

		newID++;
	}
		
	public HashMap<Integer, AccountClass> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<Integer, AccountClass> hmap) {
		this.hmap = hmap;
	}

	public AccountClass getAnID(int newID) {
		
		return this.hmap.get(newID);
		
		
	}
	

}
