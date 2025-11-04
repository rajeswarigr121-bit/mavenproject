package abstraction;

public class Abstractionchild extends Abstractionparent {

	public static void main(String[] args) {
		Abstractionchild obj = new Abstractionchild();
		obj.display();
		obj.show();
		obj.sum();
	}

	@Override
	public void sum() {
		int a = 2 + 4;
		System.out.println(a);
		// TODO Auto-generated method stub
		
	}
	public void show()
	{
		System.out.println("Child Class");
	}

}
