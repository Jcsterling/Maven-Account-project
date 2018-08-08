package com.qa.accounts.Accounts;

import org.junit.Test;

import junit.framework.Assert;

public class TDDAccounts {

	
	@Test
	public void amountOfFirstNamesTest() {
		//create 2 accounts with same first name
		ServiceClass service = new ServiceClass();
		service.addNewAcc("jim", "bob", "1738");
		service.addNewAcc("jim", "low", "1414");
				
		service.getFirstNameCount("jim");
		//assert the value (2) if firstname is jim
		Assert.assertEquals(2, service.getFirstNameCount("jim"));
	}
	

}
