package interphasepackage;

public class Interphasechild implements Interphaseparent {

	public static void main(String[] args) {
		Interphaseparent obj = new Interphasechild();
		obj.display();
		//obj.show();
		
		// TODO Auto-generated method stub

	} 

	@Override
	public void display() {
		System.out.println("Interface Example");
		// TODO Auto-generated method stub
		
	}
	public void show()
	{
		System.out.println("Interphase Package");
	}

}
