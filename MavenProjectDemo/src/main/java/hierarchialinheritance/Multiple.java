package hierarchialinheritance;

public class Multiple extends Sum {
	public void multi()
	{
		int multi = a*b;
		System.out.println(multi);
	}

	public static void main(String[] args) {
		Multiple obj = new Multiple();
		obj.multi();
		// TODO Auto-generated method stub

	}

}
