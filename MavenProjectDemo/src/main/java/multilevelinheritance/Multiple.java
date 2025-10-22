package multilevelinheritance;

public class Multiple extends Subs{
	public void multiple()
	{
		int multiplication = a*b*d;
		System.out.println(multiplication);
	}

	public static void main(String[] args) {
		Multiple obj = new Multiple();
		obj.sum();
		obj.subs();
		obj.multiple();
		
		// TODO Auto-generated method stub

	}

}
