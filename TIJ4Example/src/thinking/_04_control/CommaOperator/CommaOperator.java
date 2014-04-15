//: control/CommaOperator.java
package thinking._04_control.CommaOperator;

public class CommaOperator {
	public CommaOperator() {
		// TODO Auto-generated constructor stub
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i=" + i + "	j=" + j);
		}
	}
}/* Output
i=1	j=11
i=2	j=4
i=3	j=6
i=4	j=8
*/
