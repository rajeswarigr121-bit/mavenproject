package assignment11student;

public class Studentdetails2child extends Studentdetails {
	String address;
	public void getaddress(String a)
	{
		address = a;
	}
	public void display()
	{
	System.out.println("Enter the Studentname: "+name);
	System.out.println("Enter the Rollnumber: "+rollnumber);
	System.out.println("Enter the Address: "+address);
	}
	
	public static void main(String[] args) {
		Studentdetails2child obj = new Studentdetails2child();
		obj.getdetails("Riya", 10);
		obj.getaddress("Trivandrum");
		obj.display();
		
		
	}

}
