package com.example.demo;

public class TestForMoreThanThreeThousandandNineHundredandNinetyNine {
	public static boolean MoreThan3999(){
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();
		
		// Try catch to test whether an exception is thrown or not
		try{
			romanGenerator.generate(4000);
		}
		catch(Exception ex){ return true; }
		
		return false;
	}
}
