package singleinheritance;

public class ChildExample extends ParentExample{
	int a = 20;
	public ChildExample()
	{
		super("Hello");
		System.out.println("Child class constructor");
	}
	public void sub() {
		//super.sum(); // for calling a method
		int sub=b-a;
		System.out.println(sub);
		System.out.println("Value of a is " +super.a); // here we use super.a bcoz to get the value of a from parent class
	} //if we didn't user super.a, then we will get the valure of a from child class
	public static void main(String[] args) {
		ChildExample obj=new ChildExample();
		//obj.sum(); 
		//obj.sub();

		
	}

}
