//: initialization/OptionalTrailingArguments.java
package thinking.paragraph5.OptionalTrailingArguments;

public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		for (String s : trailing) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public OptionalTrailingArguments() {
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}
}/* Output
required: 1 one 
required: 2 two three 
required: 0 
 */
