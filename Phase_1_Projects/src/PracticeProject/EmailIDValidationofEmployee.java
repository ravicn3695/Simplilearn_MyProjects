package practiceProject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDValidationofEmployee {



	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 /*try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter vaild email ID: ");  
			 String str= scan.nextLine();   
			 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",str));*/
		
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

	

}
