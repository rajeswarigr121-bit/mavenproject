package singleinheritance;

public class ParentExample {
int a=5;
int b=10;
public ParentExample()
{
	System.out.println("Parent class constructor");
}
public ParentExample(String s)
{
	this();
	System.out.println("This is a parametre constructor"+s);
}
public void sum() {
	int sum=a+b;
	System.out.println(sum);
}
}
