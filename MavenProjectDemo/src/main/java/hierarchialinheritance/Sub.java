package hierarchialinheritance;

public class Sub extends Sum {
	public void subs()
	{
		int subs = b - a;
		System.out.println(subs);
	}

	public static void main(String[] args) {
		Sub obj = new Sub();
		obj.total();
		obj.subs();
		// TODO Auto-generated method stub

	}

}
