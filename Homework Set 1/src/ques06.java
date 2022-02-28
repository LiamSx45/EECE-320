import java.util.Scanner;

public class ques06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int heads = 0, tails = 0;
		System.out.println("For each coin toss enter either h for Heads or t for Tails.");
		for (int i = 1; i <= 8; i++) {
			String numEnding = "th";
			if (i == 1) {
				numEnding = "st";
			} else if (i == 2) {
				numEnding = "nd";
			} else if (i == 3) {
				numEnding = "rd";
			}
			System.out.println(i + numEnding + " toss:");
			String type = scan.next();
			if (type.equals("h")) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Number of Heads: " + heads);
		System.out.println("Number of Tails: " + tails);
		System.out.println("Percent Heads: " + (((double) heads / 8.0) * 100) + " %");
		System.out.println("Percent Tails : " + (((double) tails / 8.0) * 100) + " %");
	}
}
