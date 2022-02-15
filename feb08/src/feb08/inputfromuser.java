package feb08;

import java.util.Scanner;

public class inputfromuser {
	public static void main(String[] args) {
		// Step 01: Create an object for the scanner class
		
		Scanner myfirstScan = new Scanner(System.in); // obtains input from keyboard
		
		// Step 02: Print the prompt message
		
		System.out.println("Enter the name, age, and salary");
		System.out.println("_______________________________");
		System.out.println(" ");
		
		String name = myfirstScan.nextLine();
		int age = myfirstScan.nextInt();
		double salary = myfirstScan.nextDouble();
		
		System.out.println(" ");
		System.out.println("Hello " + name + "!");
		System.out.println("You are " + age + " years old.");
		System.out.println("Your salary is $" + salary);
		
	}

}
	
	