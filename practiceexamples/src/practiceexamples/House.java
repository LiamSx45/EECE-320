package practiceexamples;

import java.util.Scanner;

public class House {
	private int bedrooms;
	private int bathrooms;
	private int sqft;
	private String status;
	public static final Scanner scan = new Scanner(System.in);

	// constructer
	public House(int bed, int bath, int sq, String stat) {
		bedrooms = bed;
		bathrooms = bath;
		sqft = sq;
		status = stat;
	}

	// getter for data
	public int getbed() {
		return bedrooms;
	}

	public int getbath() {
		return bathrooms;
	}

	public int getsqft() {
		return sqft;
	}

	public String getstatus() {
		return status;
	}

	public void sellandrent() {
		System.out.print("Enter price per sqft:");
		int ppersq = scan.nextInt();
		int area = getsqft();
		ppersq = area * ppersq;
		System.out.println("House selling price" + ppersq);
		System.out.println("House renting price" + ppersq * 0.008);
	}

	public void checkstatus() {
		System.out.println("No of Bedrooms" + bedrooms);
		System.out.println("No of Bathrooms" + bathrooms);
		System.out.println("Area of House" + sqft);
		System.out.println("House status:" + status);
	}

	public static void main(String[] args) {
		House h1 = new House(3, 2, 1000, "forsale");
		h1.sellandrent();
		h1.checkstatus();
	}
}