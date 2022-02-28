public class ques05 {
	public static void main(String[] args) {

		int i = 1, square, cube, fourthpwr;

		System.out.println("| Number | Square | Cube | Fourth |");
		System.out.println(" ---------------------------------");
		System.out.print("\n");

		for (i = 1; i <= 5; i++) {
			square = i * i;
			cube = i * i * i;
			fourthpwr = i * i * i * i;
			System.out.printf("%4d %8d %8d %8d ", i, square, cube, fourthpwr);
			System.out.print("\n");
		}
	}
}
