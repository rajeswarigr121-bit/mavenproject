package singleinheritance;

public class ChildExample extends ParentExample{

	
	public void sub() {
		int sub=b-a;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		ChildExample obj=new ChildExample();
		obj.sum();
		obj.sub();

	}

}
