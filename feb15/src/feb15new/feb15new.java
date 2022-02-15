package feb15new;

class classAandB{
	private int A;
	private double B;
	// Parameterized Constructor
	classAandB(int ain, double bin){
		A = ain;
		B = bin;
		// Getters
	}
	int getAvar() {
		return A;
	}
	double getBvar() {
		return B;
	}
}

public class feb15new {
	
	public static void main(String[] args) {
		classAandB myobj = new classAandB(2,3.15);
		System.out.println("The value of A is " + myobj.getAvar());
		System.out.println("The value of B is " + myobj.getBvar());
	}

}

 