package com.cc.java;

public class Mitarbeiter {

	private String firstName;
	private String familyName;
	private int birthYear;
	

	/**
	 * @param firstName
	 * @param familyName
	 * @param birthYear
	 */
	public Mitarbeiter(String firstName, String familyName, int birthYear) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.birthYear = birthYear;
	}

	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		if (checkPermission()) {
			return familyName;
		} else {
			return "No permission!";
		}	
	}


	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	/**
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	private boolean checkPermission() {
		//... Rechtevergabe
		return true;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	
	
	
}
