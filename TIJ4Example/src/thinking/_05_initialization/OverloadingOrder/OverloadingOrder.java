//: initialization/OverloadingOrder.java
// Overloading based on the order of the arguments.
package thinking._05_initialization.OverloadingOrder;

public class OverloadingOrder {
	public void f(String s, int i) {
		System.out.println("String: " + s + ", int: " + i);
	}

	public void f(int i, String s) {
		System.out.println("int: " + i + ", String: " + s);
	}

	public OverloadingOrder() {
		f("String first", 11);
		f(99, "Int first");
	}
} /* Output
String: String first, int: 11
int: 99, String: Int first
 */// :~
