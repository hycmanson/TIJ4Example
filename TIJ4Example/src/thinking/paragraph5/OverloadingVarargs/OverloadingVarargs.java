//: initialization/OverloadingVarargs.java
package thinking.paragraph5.OverloadingVarargs;

public class OverloadingVarargs {
	public void f(Character... args) {
		System.out.print("first");
		for (Character c : args) {
			System.out.print(" " + c);
		}
		System.out.println();
	}

	public void f(Integer... args) {
		System.out.print("second");
		for (Integer i : args) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

	public void f(Long... args) {
		System.out.print("third");
	}

	public OverloadingVarargs() {
		// TODO Auto-generated constructor stub
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0L);
		// ! f(); //Won't compile -- ambiguous
	}
}/* Output
first a b c
second 1
second 2 1
second 0
third
*/
