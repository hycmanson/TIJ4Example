//: initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won't compile)
package thinking.paragraph05.OverloadingVarargs2;

public class OverloadingVarargs2 {
	public void f(float i, Character... args) {
		System.out.println("first");
	}

	public void f(char c, Character... args) {
		System.out.println("second");
	}

	public OverloadingVarargs2() {
		// TODO Auto-generated constructor stub
		f(1, 'a');
		f('a', 'b');
	}
}/* Output
first
second
*/
