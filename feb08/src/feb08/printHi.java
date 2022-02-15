package feb08;

// Step 01: Write the class Definition

class MyFirstClass{
	int x=10;
	double y=20.4;
	void printxandy() {
		System.out.println(x);
		System.out.println(y);
	}
	
}

// Step 02: Create a tester class

public class printHi {
	
	static void welcome() {
		System.out.println("Welcome Guys!");
		
	}
	
	public static void main(String[] args) {
		welcome();
		// Step 03: Create an object
		
		MyFirstClass c = new MyFirstClass();
		System.out.println(c.x);
		System.out.println(c.y);
		c.printxandy();
	}

}

//Notes

// Note 01: Any static method be defined in same class that is used to call it (Linen 19)
// Note 02: Constructor Function: A method that has the same name as your class | It has no return type (no need to write void) | Should initialize your data members




