package com.qa.accounts.Accounts;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainClass {


	static ServiceClass service = new ServiceClass();
	static AccountClass account;


	public static void main(String[] args) {
		
		TurnHashMapToJSON();
		
		}
	
	public static void addAcc() {
		
		service.addNewAcc("jim", "bob", "1738");
		service.addNewAcc("buk", "low", "1414");
		service.addNewAcc("bob-lee", "swagger", "1000");
		service.addNewAcc("jim", "bobulation", "8000");
	}
	
	public static void TurnHashMapToJSON() {
		
		addAcc();
		
		AccountClass account = service.getAnID(2);
		HashMap<Integer, AccountClass> hmap  = service.getHmap();
		
		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
		String prettyJson = prettyGson.toJson(hmap);
		System.out.println("\nPretty JSONObject ==> " + prettyJson  );
		
		System.out.println("****** ****** ****** ****** ****** ****** ****** ******");
		
		String prettyJsonSelectOnePerson = prettyGson.toJson(account);
		System.out.println("\nPretty JSONObject ==> " + prettyJsonSelectOnePerson );
		
		
	}
	
	
}
