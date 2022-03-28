package Assignment01;

import java.util.Scanner;

public class Maincipher {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter message, shift and rotate:");

		// String input
		String msg = myObj.nextLine();

		// Numerical input
		int sNum = myObj.nextInt();
		int rNum = myObj.nextInt();

		var cc = new ciphercoder(msg, sNum, rNum);
	}

}