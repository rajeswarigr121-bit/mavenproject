package exceptionhandling;

public class ThrowandThrows {

	public static void main(String[] args) throws VotingException  {
		int age = 15;
		if (age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new VotingException("not eligible");
		}
		// TODO Auto-generated method stub

	}

}
