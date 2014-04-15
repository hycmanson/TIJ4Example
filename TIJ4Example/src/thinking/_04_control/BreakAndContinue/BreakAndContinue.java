//: control/BreakAndContinue.java
// Demonstrates break and continue keywords.
package thinking._04_control.BreakAndContinue;

import net.mindview.util.Range;

public class BreakAndContinue {
	public BreakAndContinue() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 100; i++) {
			// Out of for loop+
			if (i == 74)
				break;
			// Next iteration
			if (i % 9 != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		// Using foreach:
		for (int i : Range.range(100)) {
			// Out of for loop
			if (i == 74)
				break;
			// Next iteration
			if (i % 9 != 0)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 0;
		// An "infinite loop":
		while (true) {
			i++;
			int j = i * 27;
			// Out of loop
			if (j == 1269)
				break;
			// Top of loop
			if (i % 10 != 0)
				continue;
			System.out.print(i + " ");
		}
	}
} /* Output:
0 9 18 27 36 45 54 63 72 
0 9 18 27 36 45 54 63 72 
10 20 30 40 
 *///~
