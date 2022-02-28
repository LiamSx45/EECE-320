import java.util.Scanner;

public class ques02 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Hello, please choose a letter from a to e. ");
		char choice = scan.next().charAt(0);
		switch (choice) {
		case 'a':
			System.out.println("The letter you picked is a. ");
			break;
		case 'b':
			System.out.println("The letter you picked is b. ");
			break;
		case 'c':
			System.out.println("The letter you picked is c. ");
			break;
		case 'd':
			System.out.println("The letter you picked is d. ");
			break;
		case 'e':
			System.out.println("The letter you picked is e. ");
			break;
		default:
			System.out.println("There has been an error.");
			System.out.println("You have made an invalid choice.");
			System.out.println("Please try again!");
		}
	}
}
