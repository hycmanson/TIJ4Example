//: access/ChocolateChip.java
// Can't use package-access member from another package.
package thinking.paragraph06.ChocolateChip;

import thinking.paragraph06.Cookie.*;

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		// TODO Auto-generated constructor stub
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		// ! bite(); //Can't access bite
	}
}/* Output
Cookie constructor
ChocolateChip constructor
 */
