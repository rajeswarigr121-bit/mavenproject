package collections;

import java.util.ArrayList;
import java.util.List;

public class Listexample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String> (); //here "list" is variable name, we can give any other names also
		list.add("Red");
		list.add("Yellow");
		list.add("Blue");
		list.add("Red");
		System.out.println(list);
		System.out.println(list.contains("Blue")); // to check the given name is already there or not, if not there we will get the result as False.
		System.out.println(list.indexOf("Red")); //to know the position of 1st Red. (to find the index of an element)
		System.out.println(list.lastIndexOf("Red")); // to know the position of last Red.
		System.out.println(list.get(2)); // to know element of that particular index.
		System.out.println(list.size());// to know the size of the element. here there are 4 elements
		System.out.println(list.isEmpty()); //to check whether the list is empty or not,
		list.remove(3);// to remove the index element, so for output we get the value as [Red, Yellow, Blue]
		System.out.println(list);
		// TODO Auto-generated method stub

	}

}
