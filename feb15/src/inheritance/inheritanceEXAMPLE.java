package inheritance;

// Step 01: Create a Parent Class

class twoDpoint{
	int x;
	int y;
	
	// Setters
	
	void setx(int xin) {
		x = xin;
	}
	void sety(int yin) {
		y = yin;
	}
	
	// Getters
	
	int getx() {
		return x;
	}
	int gety() {
		return y;
	}
}

// Step 02: Create a Child Class

class threeDpoint extends twoDpoint{
	private int z;
	threeDpoint(int xin, int yin, int zin){
		x = xin;
		y = yin;
		z = zin;
	}
	void setz(int zin) {
		z = zin;
	}
	int getz() {
		return z;
	}
}

public class inheritanceEXAMPLE {

	public static void main(String[] args) {
		// Step 03: Create Object from the child
		threeDpoint myobj = new threeDpoint(2,3,4);

	}

}
