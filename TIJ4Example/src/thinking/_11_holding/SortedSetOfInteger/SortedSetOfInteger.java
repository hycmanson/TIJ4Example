package thinking._11_holding.SortedSetOfInteger;

import java.util.*;

//: holding/SortedSetOfInteger.java

public class SortedSetOfInteger {
	public SortedSetOfInteger() {
		Random rand = new Random(47);
		SortedSet<Integer> iniset = new TreeSet<Integer>();
		for (int i = 0; i < 10000; i++)
			iniset.add(rand.nextInt(30));
		System.out.println(iniset);
	}
} /* Output
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
*///:~
