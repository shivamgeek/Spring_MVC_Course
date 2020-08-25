package com.shivam;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BRZ", "BRAZIL");
		countryOptions.put("IND", "INDIA");
		countryOptions.put("JPN", "JAPAN");
		countryOptions.put("SPN", "SPAIN");
		countryOptions.put("USA", "United States of America");
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	
}
