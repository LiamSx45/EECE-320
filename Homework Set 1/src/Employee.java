class Employee {
	private String first_name;
	private String last_name;
	private int years_of_exp;
	private double salary;

	public void set_first_name(String first_name) {
		this.first_name = first_name;
	}

	public void set_last_name(String last_name) {
		this.last_name = last_name;
	}

	public void set_years_of_exp(int years_of_exp) {
		this.years_of_exp = years_of_exp;
	}

	public void set_salary(double salary) {
		if (salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
	}

	public String get_first_name() {
		return first_name;
	}

	public String get_last_name() {
		return last_name;
	}

	public int get_years_of_exp() {
		return years_of_exp;
	}

	public double get_salary() {
		return salary;
	}

	public void raise_salary() {
		System.out.println("Old Salary: " + salary);
		if (years_of_exp > 5 || salary < 2000) {
			salary = salary + (0.1 * salary);
		}
		System.out.println("New Salary: " + salary);
		System.out.print("\n");
	}

	public static void main(String[] args) {
		Employee ob1 = new Employee();
		Employee ob2 = new Employee();

		ob1.set_first_name("Apple");
		ob1.set_last_name("Seed");
		ob1.set_years_of_exp(7);
		ob1.set_salary(3000);
		ob1.raise_salary();

		ob2.set_first_name("Liam");
		ob2.set_last_name("Sawyer");
		ob2.set_years_of_exp(5);
		ob2.set_salary(3000);
		ob2.raise_salary();
	}
}
