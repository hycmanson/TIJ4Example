//: initialization/ArraysOfPrimitives.java
package thinking._05_initialization.ArraysOfPrimitives;

public class ArraysOfPrimitives {
	public ArraysOfPrimitives() {
		int[] a1 = { 1, 2, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++) {
			a2[i] = a2[i] + 1;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1[" + i + "]=" + a1[i]);
		}
	}
}/* Output
a1[0]=2
a1[1]=3
a1[2]=3
a1[3]=4
a1[4]=5
a1[5]=6
*/
