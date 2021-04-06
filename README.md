# Arabic-To-Roman-Numerals (Java)
Use this project to convert Arabic numerals to Roman numerals easily and efficiently

# Structure of files in this directory:

This is the Root directory
::> src (contains two subfolders)

    -> main (contains 6 files)
    
    -> test (contains 5 files)

::> main (contains two subfolders)

    
    -> java (More details and further explanation)
       
       -> com.example.demo (contains 6 files)
       
          -> controller (contains 1 file)
          
    -> resources
## controller has RestProgram file  
## com.example.demo has below 6 files   

## com.example.demo/ArabicToRomanNumeralDictionary 
is the sub folder containing program executables for ArabicToRomanNumeralDictionary
 
## com.example.demo/ArabicToRomanNumeralGenerator 
is the sub folder containing program executables for ArabicToRomanNumeralGenerator

## com.example.demo/DemoApplication 
is the sub folder containing program executables to run the spring boot application

## com.example.demo/MvcConfig 
 is the sub folder containing program executables for the login registry service
 
## com.example.demo/WebSecurityConfig 
 is the sub folder containing program executables for the user authentication

## com.example.demo/RomanNumeralGenerator 
is the sub folder containing the interface

## test/java/com.example.demo
 is the sub folder containing all the java files to test the execution of the solution
 
 ## Note: 
 
 Run the RestAPIController
 path: src/main/java/com.example.demo/controller/RestProgram
 
 After the service is up, open the browser with url http://localhost:8080/api/1 and check for the login page
 with credentials
 UserName as user
 Password as password
 
 Then click on signin button and check the output with its corresponding roman number
 
 Try with different API calls
 http://localhost:8080/api/10
 http://localhost:8080/api/257


# The Challenge Solved Here -> Roman Numerals
In whatever language you prefer, write a class that implements the following interface (example given in Java):

	public interface RomanNumeralGenerator {
	
	   public String generate(int number); 
	   
	}
	
	For example, see the following sample inputs and outputs: 
	
	1 = “I” 
	
	5 = “V” 
	
	10 = “X” 
	
	20 = “XX” 
	
	3999 = “MMMCMXCIX”
	
	----------------------------------------------------------
	----------------------------------------------------------
	
