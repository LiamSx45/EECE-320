import java.util.Scanner;

public class RatingScore {

	private String description;
	private int rating;
	private int maxRating;

	public RatingScore(String description, int maxRating) {
		this.description = description;
		this.maxRating = maxRating;
	}

	public int getRating() {
		return rating;
	}

	public int getMaxRating() {
		return maxRating;
	}

	public void getRatingFromUser() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your rating for the movie " + description + "?");
		System.out.print("Please enter an number from 0 to " + maxRating + ": ");
		rating = in.nextInt();
	}

	public String getDisplayableString() {
		return String.format("The rating is %d/%d for %s", rating, maxRating, description);
	}

	public static void main(String[] args) {
		RatingScore ratingScore = new RatingScore("Star Wars", 10);
		ratingScore.getRatingFromUser();
		System.out.println(ratingScore.getDisplayableString());
	}
}
