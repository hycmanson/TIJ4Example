package thinking._11_holding.ForEachCollections;

import java.util.*;

//: holding/ForEachCollections.java

public class ForEachCollections {
	public ForEachCollections() {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for (String s : cs) {
			System.out.print("'" + s + "' ");
		}
	}
}/* Output
'Take' 'the' 'long' 'way' 'home' 
*///:~