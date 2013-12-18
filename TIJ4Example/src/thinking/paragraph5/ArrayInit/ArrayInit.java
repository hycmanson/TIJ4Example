//: initialization/ArrayInit.java
// Array initialization.
package thinking.paragraph5.ArrayInit;

import java.util.Arrays;

public class ArrayInit {
	public ArrayInit() {
		Integer[] a = { new Integer(1), new Integer(2), 3,// AutoBoxing
		};
		Integer[] b = { new Integer(1), new Integer(2), 3,// AutoBoxing
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}/* Output
[1, 2, 3]
[1, 2, 3]
*/
