import java.util.Scanner;

public class ques01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the dollar value of the check:");
		int n = scan.nextInt();
		double charge;
		if (n <= 10) {
			charge = 1;
		} else if (n > 10 && n <= 100) {
			charge = (n * 10) / 100.0;
		} else if (n > 100 && n <= 1000) {
			charge = 5 + (n * 5) / 100.0;
		} else {
			charge = 40 + (n * 1) / 100.0;
		}
		System.out.println("Total charges for this check: " + charge);
	}
}
