package com.example.demo;

public class TestForLessThanOne {
	public static boolean LessThanOne(){
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();
		
		// Try catch to test whether an exception is thrown or not
		try{
			romanGenerator.generate(0);
		}
		catch(Exception ex){ return true; }
		
		return false;
	}
}
