package accessmodifier;

public class Acess2 extends Acess1 {
	public static void main (String args[])
	{
		Acess2 obj = new Acess2();
		obj.publicmethod();
		//obj.privatemethod(); here we cant call privatemethode bcoz only in parentclass we can access privatemethod.
		obj.defaultmethod();
	    obj.protectedmethod();
	}

}
