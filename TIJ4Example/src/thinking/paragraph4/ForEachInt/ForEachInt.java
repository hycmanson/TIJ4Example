//: control/ForEachInt.java
package thinking.paragraph4.ForEachInt;

import net.mindview.util.Range;

public class ForEachInt {
	public ForEachInt() {
		// TODO Auto-generated constructor stub
		// 0...9
		for (int i : Range.range(10))
			System.out.print(i + " ");
		System.out.println();
		// 5...9
		for (int i : Range.range(5, 10))
			System.out.print(i + " ");
		System.out.println();
		// 5...20 step 3
		for (int i : Range.range(5, 20, 3))
			System.out.print(i + " ");
	}
} /* Output
0 1 2 3 4 5 6 7 8 9 
5 6 7 8 9 
5 8 11 14 17 
*///~