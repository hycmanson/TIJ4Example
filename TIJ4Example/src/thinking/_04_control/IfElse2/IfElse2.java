//: control/IfElse2.java
package thinking._04_control.IfElse2;

public class IfElse2 {
	public int result = 0;

	public int test(int testval, int target) {
		if (testval > target) {
			return +1;
		} else if (testval < target) {
			return -1;
		} else {
			// Match
			return 0;
		}
	}

	public IfElse2() {
		// TODO Auto-generated constructor stub
		System.out.println(test(10, 5));
		System.out.println(test(5, 10));
		System.out.println(test(5, 5));
	}
}/* Output
1
-1
0
*///~
