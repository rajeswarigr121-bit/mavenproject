package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorexample {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>	();
		array.add("Trivangle");
		array.add("Circle");
		array.add("Rectangle");
		array.add("Square");
		Iterator it = array.iterator(); //Iterator is cumplusory namee, instead of it  we can give any variable
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(array);
		
		// TODO Auto-generated method stub

	}

}
