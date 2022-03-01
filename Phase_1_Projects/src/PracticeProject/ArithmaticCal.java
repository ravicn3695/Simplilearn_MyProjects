package practiceProject;

import java.util.Scanner;

public class ArithmaticCal {

	public static void main(String[] args) {
		System.out.println("Arithmatic calculator");
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("Enter First number: ");
			int firstnumber = input.nextInt();
			System.out.print("Enter Second number: ");
			int secoundnumber = input.nextInt();
			
			System.out.println("1.Addition\n2.subtraction\n3.multiplication\n4.division");
			int num = input.nextInt();
			switch (num) 
			{
			case 1: System.out.println("Addition of two Numbers :"+(firstnumber+secoundnumber));
			break;
			case 2: System.out.println("subtraction of two numbres :"+(firstnumber-secoundnumber));
			break;
			case 3: System.out.println("multiplication of two numbers :"+(firstnumber*secoundnumber));
			break;
			case 4: System.out.println("division of two numbers :"+(firstnumber/secoundnumber));
			default:System.out.println("Invalid number please enter correct number ");
				throw new IllegalArgumentException("Unexpected value: ");
			}
		}

	}

}
