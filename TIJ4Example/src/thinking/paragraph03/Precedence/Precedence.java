//: operators/Precedence.java
package thinking.paragraph03.Precedence;

public class Precedence {
	public Precedence() {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println("a = " + a + "   b = " + b);
	}
}/*
 * Output: a = 5 b = 1
 */// :~
