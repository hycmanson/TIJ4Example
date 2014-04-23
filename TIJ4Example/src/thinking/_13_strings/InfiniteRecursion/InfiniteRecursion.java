package thinking._13_strings.InfiniteRecursion;

import java.util.*;

//: strings/InfiniteRecursion.java
// Accidental recursion.
// {RunByHand}
public class InfiniteRecursion {
	public String toString() {
		return "InfiniteRecursion address: " + super.toString() + "\n";
	}

	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}/* Output
[InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@4aa0ce
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@1833eca
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@18f5824
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@1e3cd51
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@bc8e1e
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@11671b2
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@82764b
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@12452e8
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@1bf3d87
, InfiniteRecursion address: thinking._13_strings.InfiniteRecursion.InfiniteRecursion@60991f
]
*///:~
