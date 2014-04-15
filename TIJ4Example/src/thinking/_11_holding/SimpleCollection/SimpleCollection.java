package thinking._11_holding.SimpleCollection;

import java.util.ArrayList;
import java.util.Collection;

//: holding/SimpleCollection.java

public class SimpleCollection {
	public SimpleCollection() {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) 
			c.add(i); // Autoboxing
		for (Integer i : c) 
			System.out.print(i + ", ");
	}
} /* Output
0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
*///:~
