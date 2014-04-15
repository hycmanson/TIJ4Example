//: initialization/AutoboxingVarargs.java
package thinking._05_initialization.AutoboxingVarargs;

public class AutoboxingVarargs {
	public void f(Integer... args) {
		// TODO Auto-generated constructor stub
		for (Integer i : args) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
