package com.cc.java;

public class Firma {

	public static void main(String[] args) {
		
	Mitarbeiter ma = new Mitarbeiter("Max", "Mustermann", 1980);	
	
	ausgabe(ma.getFamilyName());
	ma.setFamilyName("Lehmann");
	ausgabe(ma.getFamilyName());
	ausgabe("Geburtsjahr :" + ma.getBirthYear());
	}
	
	static void ausgabe(String outStr) {
		System.out.println(outStr);
		// --> file
	}

}
