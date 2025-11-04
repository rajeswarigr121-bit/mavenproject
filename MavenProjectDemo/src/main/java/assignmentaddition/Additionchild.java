package assignmentaddition;

public class Additionchild extends Additionparent {
public void display (int a, int b) {
	int sum = super.sum(a,b);
	if(sum%10==0)
	{
		System.out.println("Is divisible by 10");
	}
	else {
		System.out.println("Is not divisible by 10");
	}
}
	public static void main(String[] args) {
		Additionchild obj = new Additionchild();
		obj.display(20,25
				);

	}

}
