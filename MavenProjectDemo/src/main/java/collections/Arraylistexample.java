package collections;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>	();
		array.add("Trivangle");
		array.add("Circle");
		array.add("Rectangle");
		array.add("Square");
		ArrayList<String> array2 = new ArrayList<String> ();
		array2.add("One");
		array2.add("Two");
		array2.add("Three");
		array.addAll(array2); // to join two array we use
		System.out.println(array);
		System.out.println(array.containsAll(array2)); // to check whether all elements in array2 are there or not in array(together)
		

	}

}
