//: operators/Overflow.java
// Surprise! Java lets you overflow.
package thinking.paragraph03.Overflow;

public class Overflow {
	public Overflow() {
		// TODO Auto-generated constructor stub
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}
} /* Output:
big = 2147483647
bigger = -4
*/
