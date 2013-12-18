//: initialization/ArrayNew.java
// Creating arrays with new.

package thinking.paragraph5.ArrayNew;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public ArrayNew() {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a=" + a.length);
		System.out.println(Arrays.toString(a));
	}
}/* Output
length of a=18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*/
