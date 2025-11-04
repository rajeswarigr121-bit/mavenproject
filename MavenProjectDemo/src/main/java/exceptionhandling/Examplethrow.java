package exceptionhandling;

public class Examplethrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		if (age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("not eligible");
		}
	}

}
