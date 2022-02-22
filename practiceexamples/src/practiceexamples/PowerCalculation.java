package practiceexamples;

public class PowerCalculation {
	private int num;
	private int power;
	PowerCalculation(int numinput, int powerinput){
		num = numinput;
		power = powerinput;
	}
	int getnum() {
		return num;
	}
	int getpower() {
		return power;
	}
	void Calculation() {
		if (power==0) {
			int result = 1;
			for(int i=2; i <= num; i++)
				result *= i;
			System.out.println("The Factorial of " + num + " equals " + result);
		} else {
			int result =1;
			for(int i=1; i <= power; i++)
				result = result*num;
			System.out.println("The Value of " + num + " to the power of " + power + " equals " + result);	
		}
	}
	public static void main(String[] args) {
		PowerCalculation p1 = new PowerCalculation(2,3);
		p1.Calculation();
		
		PowerCalculation p2 = new PowerCalculation(3,0);
		p2.Calculation();

	}

}
