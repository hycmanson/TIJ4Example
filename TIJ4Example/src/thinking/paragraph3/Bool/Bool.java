//: operators/Bool.java
// Relational and logical operators.
package thinking.paragraph3.Bool;

import java.util.Random;

public class Bool {
	public Bool() {
		// TODO Auto-generated constructor stub
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i == j is " + (i == j));
		System.out.println("i != j is " + (i != j));
		// Treating an int as a boolean is not legal Java:
		// ! System.out.println("i && j is " + (i && j));
		// ! System.out.println("i || j is " + (i || j));
		// ! System.out.println("!i is " + !i);
		System.out.println("(i < 10)&&(j < 10) is " + ((i < 10) && (j < 10)));
		System.out.println("(i < 10)||(j < 10) is " + ((i < 10) || (j < 10)));
	}
} /* Output
i = 58
j = 55
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i < 10)&&(j < 10) is false
(i < 10)||(j < 10) is false
*///:~