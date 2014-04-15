//: operators/AutoInc.java
// Demonstrates the ++ and -- operators.
package thinking._03_operators.AutoInc;

public class AutoInc {
	public AutoInc() {
		int i = 1;
		System.out.println("i	: " + i);
		System.out.println("++i	: " + ++i);	// Pre-increment
		System.out.println("i++	: " + i++);	// Post-increment
		System.out.println("i	: " + i);
		System.out.println("--i	: " + --i); // Pre-decrement
		System.out.println("i--	: " + i--); // Post-decrement
		System.out.println("i	: " + i);
	}
}/*Output
i	: 1
++i	: 2
i++	: 2
i	: 3
--i	: 2
i--	: 2
i	: 1
*///:~
