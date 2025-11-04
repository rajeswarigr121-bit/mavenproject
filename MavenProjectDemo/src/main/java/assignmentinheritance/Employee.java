package assignmentinheritance;

public class Employee {
	double basicpay = 20000.0;
	double deduction = 1000.0;
	double bonus = 1500.0;
	public void getdetails() {
		System.out.println("Basic pay: " +basicpay);
		System.out.println("Deduction: " +deduction);
		System.out.println("Bonus: " +bonus);
	}

}
