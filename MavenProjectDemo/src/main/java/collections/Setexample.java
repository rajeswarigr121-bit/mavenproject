package collections;

import java.util.HashSet;
import java.util.Set;

public class Setexample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();	//import 1st Set, also if its interger
		set.add("Rajeswari");
		set.add("Salma");
		set.add("Sreekutty");
		set.add("Thanuja");
		Set<String> set1 = new HashSet<String> ();
		set1.add("one");
		set1.add("Two");
		set1.add("Three");
		set.addAll(set1);
		System.out.println(set);
		System.out.println(set.containsAll(set1));

	}

}
