package thinking._11_holding.SetOfInteger;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//: holding/SetOfInteger.java

public class SetOfInteger {
	public SetOfInteger() {
		Random rand = new Random(47);
		Set<Integer> intset = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
	}
} /* Output
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 16, 19, 18, 21, 20, 23, 22, 25, 24, 27, 26, 29, 28]
*///:~
