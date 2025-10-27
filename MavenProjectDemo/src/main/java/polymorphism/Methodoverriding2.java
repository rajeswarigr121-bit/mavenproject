package polymorphism;

public class Methodoverriding2 extends Methodoverriding {
	public void display()
	{
		super.display();// calling method from parent class
		System.out.println("Child class method");
		
	}

	public static void main(String[] args) {
		Methodoverriding2 obj = new Methodoverriding2();
		obj.display();
		// TODO Auto-generated method stub

	}

}
