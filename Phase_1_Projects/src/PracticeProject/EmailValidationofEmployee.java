package practiceProject;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;
import java.util.regex.*; 

public class EmailValidationofEmployee {
	
	public static void main(String[] args) {
		

		List<String> emails = new ArrayList<String>();
		
// valid email addresses 
		emails.add("ravi@gmail.com"); 
		emails.add("jon.rick@hot.com"); 
		emails.add("murthy@example.me.org");
		
//invalid email addresses 
		emails.add("chandra.example.com"); 
		emails.add("raghu..lol@example.com"); 
		emails.add("shiva@.example.com");
		
		for (String value : emails) {
			System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
			}
		
		System.out.println("Enter any email address to check"); 
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

}

public static boolean isValidEmail(String email) { 
	
	String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*" + "@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	//String regex = "^(.+)@(.+)$";
	//String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	//String regex = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@"+"[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";
	
	
//initialize the Pattern object
	Pattern pattern = Pattern.compile(regex); 
	Matcher matcher = pattern.matcher(email); 
	return matcher.matches();

}

}



//Another way of program

/*public class EmailIDValidationofEmployee {



	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter vaild email ID: ");  
			 String str= scan.nextLine();   
			 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",str));
		
		System.out.println("Enter any email ID to check: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("The Entered Email ID " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		}
		
		public static boolean isValidEmail(String email) {
		String regex = "[a-z0-9]+@[a-z]+\\\\.[a-z]{2,3}";
		//initialize the Pattern object
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		}

}*/





