package thinking._11_holding.AppleAndOrangesWithGenerics;

import java.util.ArrayList;

import thinking._11_holding.AppleAndOrangesWithoutGenerics.Apple;

//: holding/AppleAndOrangesWithGenerics.java

public class AppleAndOrangesWithGenerics {
	public AppleAndOrangesWithGenerics() {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
			// Compile-time error;
		}
		// apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			System.out.println(apples.get(i).id());
			// Using foreach;
		}
		for (Apple c : apples) {
			System.err.println(c.id());
		}
	}
} /* Output
0
1
2
0
1
2
*///:~