package com.example.demo.controller;

import com.example.demo.ArabicToRomanNumeralGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestProgram {

	@GetMapping(value = "/{number}")
	public String convertController(@PathVariable("number") int arabicNumber) {
		ArabicToRomanNumeralGenerator romanGenerator = new ArabicToRomanNumeralGenerator();
		return romanGenerator.generate(arabicNumber);
	}

}
