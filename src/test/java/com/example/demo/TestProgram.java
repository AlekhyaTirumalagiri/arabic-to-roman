package com.example.demo;

public class TestProgram {
	public static void main(String[] args){
		
		if(TestForLessThanOne.LessThanOne()) System.out.println("TestForLessThanOne: Passed");
		else System.out.println("TestForLessThanOne: Failed");
		
		if(TestForMoreThanThreeThousandandNineHundredandNinetyNine.MoreThan3999()) System.out.println("TestForMoreThanThreeThousandandNineHundredandNinetyNine: Passed");
		else System.out.println("TestForMoreThanThreeThousandandNineHundredandNinetyNine: Failed");
		
		if(TestForArabicToRomanNumeral.ConvertedProperly()) System.out.println("TestForArabicToRomanNumeral: Passed");
		else System.out.println("TestForArabicToRomanNumeral: Failed");
	}
}