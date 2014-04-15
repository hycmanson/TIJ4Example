//: control/IfElse.java
package thinking._04_control.IfElse;

public class IfElse {
	public int result = 0;

	public void test(int testval, int target) {
		if (testval > target) {
			result = +1;
		} else if (testval < target) {
			result = -1;
		} else {
			// Match
			result = 0;
		}
	}

	public IfElse() {
		// TODO Auto-generated constructor stub
		test(10, 5);
		System.out.println(result);
		test(5, 10);
		System.out.println(result);
		test(5, 5);
		System.out.println(result);
	}
}/* Output
1
-1
0
*///~
