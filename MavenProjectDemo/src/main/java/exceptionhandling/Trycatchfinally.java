package exceptionhandling;

public class Trycatchfinally {

	public static void main(String[] args) {
		try {
			String n = null;
			System.out.println(n.length());
			/*int a = 50;
			int b = 0;
			int c = a/b;*/
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		catch (ArithmeticException x)
		{	
			System.out.println(x);
		}
		catch (Throwable y)
		{
			System.out.println(y);
		}
		finally
		{
			System.out.println("Exception");
		}
		// TODO Auto-generated method stub

	}

}
