package polymorphismassignment;

public class Offseason extends Onseason {
	public void discount (double price) 
	{
		price = price*0.15;
		System.out.println("Enter the Offseason : "+price);
		
	}

	public static void main(String[] args) 
	{
		Offseason obj = new Offseason();
		Onseason object = new Onseason();
		obj.discount(1000);
		obj.discount(1000);
		
	}

}
