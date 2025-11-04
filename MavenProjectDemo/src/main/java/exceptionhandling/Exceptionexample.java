package exceptionhandling;

public class Exceptionexample {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
		String a = null;
		System.out.println(a.length());
		}
		catch (Throwable e)
		{
			System.out.println(e);
		}
		finally { // whereever a code need to run cumpulsory, it should be given inside finally
		System.out.println("After Exception");
		}
		// TODO Auto-generated method stub

	}

}
