package Employee_Example;

//Step 01: Create Parent Class

class Employee{
	double salary = 1000;
	void printEmployee() {
		System.out.println("Hello Employee!");
	}
}

// Step 02: Create the Programmer class which is a child of the Employee Class

class Programmer extends Employee{
	double bonus;
	Programmer(double sin, double boin){
		super.salary =sin;
		this.bonus = boin;
	}
	void printData() {
		System.out.println("Your salary is "+ super.salary);
		System.out.println("Your bonus is "+ this.bonus);
	}
}

// Step 03: Create the JavaProgrammer class as a child to the Programmer class (Multilevel Inheritance)

class JavaProgrammer extends Programmer{
	double weeklyRate;
	JavaProgrammer(double sin, double boin, double wrin){
		super(sin,boin);
		weeklyRate = wrin;	
	}
}

// Hierarchical Inheritance

class Engineer extends Employee {
	String specialization;
	Engineer(double sin, String spin){
		super.salary = sin;
		specialization = spin;
	}
	void printSpec() {
		System.out.println("Your Engineering Specialization is "+ specialization);
	}
}

public class Employee_Example {

	public static void main(String[] args) {
		
		// Step 03: Create an object from the child
		
		Engineer e1 = new Engineer(1200,"ECE");
		e1.printEmployee();
		e1.printSpec();
		JavaProgrammer j1 = new JavaProgrammer(1200,200,10);
		j1.printData();

	}

}
