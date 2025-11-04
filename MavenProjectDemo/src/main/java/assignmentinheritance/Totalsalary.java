
package assignmentinheritance;

public class Totalsalary extends Salary {
	double total;
	public void getsalaryslip() {
		total = basicpay+hra-pf-deduction+bonus;
		System.out.println("Salaryslip: "+total);
	}

	public static void main(String[] args) {
		Totalsalary obj = new Totalsalary();
		obj.getdetails();
		obj.display();
		obj.getsalaryslip();
		// TODO Auto-generated method stub

	}

}
