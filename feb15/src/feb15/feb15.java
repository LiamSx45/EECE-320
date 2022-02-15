package feb15;

import java.util.Scanner;

public class feb15 {

	public static void main(String[] args) {
		int a=5;
		double b;
		System.out.println(a);
		// scanner class
		Scanner myscan = new Scanner(System.in);
		System.out.println("Please enter age and weight");
		int age = myscan.nextInt();
		double weight = myscan.nextDouble();
		Scanner myscanname = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = myscanname.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
		System.out.println("You weigh " + weight);
	}

}
