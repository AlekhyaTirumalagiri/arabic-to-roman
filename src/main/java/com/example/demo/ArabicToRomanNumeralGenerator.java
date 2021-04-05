package com.example.demo;

public class ArabicToRomanNumeralGenerator implements RomanNumeralGenerator {

	// Initiating the ArabicToRomanNumeralDictionary class so that the Arabic to Roman
	// key value mapping can be used later in this class for explicit conversion
	private ArabicToRomanNumeralDictionary dictionary = new ArabicToRomanNumeralDictionary();
	
	public String generate(int number) {
		
		// Check if the passed number parameter falls within the range of 1 to 3999, inclusive
		// or else throw NumberFormatException to the user
		if(number < 1) throw new IllegalArgumentException("Only supports numbers between 1 and 3999."+
						"The provided number is less than 1.");
		if(number > 3999) throw new IllegalArgumentException("Only supports numbers between 1 and 3999."+
				"The provided number is more than 3999.");
		
		// Fetch the closest Arabic number from the ArabicToRomanNumeralDictionary map
		int arabicNumberFound = Integer.parseInt(dictionary.map.floorKey(number).toString());
		
		// If the passed Arabic number if already found from the ArabicToRomanNumeralDictionary map
		// then return the Roman conversion of that Arabic number
		if(arabicNumberFound == number) return dictionary.map.get(number).toString();
		
		// Or else keep iterating through the Arabic numbers till the exact match from the
		// ArabicToRomanNumeralDictionary map is found. Here the matching and mapping process
		// is iterated using recursion.
		return dictionary.map.get(arabicNumberFound).toString() + generate(number - arabicNumberFound);
	}

}
