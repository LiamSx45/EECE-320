public class Rectangle {

	private int length, width;

	public Rectangle() {
		length = 0;
		width = 0;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 12);
		System.out.println("The area is: " + rect.area());
		System.out.println("The perimeter is: " + rect.perimeter());
	}
}
