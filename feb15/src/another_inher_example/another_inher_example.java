package another_inher_example;


// Step 01: Create Parent Class

class myBaseClass{
	double x;
	double y;
	double addXandY() {
		return x+y;
	}
	double subXandY() {
		return x-y;
	}
}

// Step 02: Create a child class

class myChildClass extends myBaseClass{
	myChildClass(double xin, double yin){
		super.x = xin;
		super.y = yin;
	}
	
	// New Methods
	
	double divXandY() {
		return x/y;
	}
	double multXandY() {
		return x*y;
	}
}




public class another_inher_example {

	public static void main(String[] args) {
		// Step 03: Create an object from the child
		myChildClass myobj = new myChildClass(2.5,3.5);
		System.out.println(myobj.addXandY());
		System.out.println(myobj.subXandY());
		System.out.println(myobj.divXandY());
		System.out.println(myobj.multXandY());
		

	}

}
