package accessmodifier;

public class Acess1 {
	public int a = 5;
	private int b = 10;
	int c = 5; // this is default variable
	protected int d = 20;
	
	public void publicmethod()
	{
		System.out.println("This is a public method "+a );
	}
	private void privatemethod()
	{
		System.out.println("This is a private method "+b);
	}
    void defaultmethod()
	{
		System.out.println("This is a default method "+c);
	}
    protected void protectedmethod()
    {
    	System.out.println("This is a protected method "+d);
    }
	
	/*
	 * public static void main(String[] args) { Acess1 obj = new Acess1();
	 * obj.publicmethod(); obj.privatemethod(); obj.defaultmethod();
	 * obj.protectedmethod();
	 * 
	 * // TODO Auto-generated method stub
	 * 
	 * }
	 */
	 

}
