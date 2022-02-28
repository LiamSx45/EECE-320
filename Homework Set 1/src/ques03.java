import java.util.Scanner;

public class ques03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a value for x: ");

		int fistnum = Integer.parseInt(scan.next());

		System.out.print("Please enter a value for y: ");

		int secondnum = Integer.parseInt(scan.next());

		if ((fistnum % secondnum) == 0) {

			System.out.println("Your first number, x = " + fistnum + " is divisible by your second number, y = "
					+ secondnum + ".");
		} else {

			System.out.println("Your first number, x = " + fistnum + " is not divisible by your second number, y = "
					+ secondnum + ".");
		}
	}
}
