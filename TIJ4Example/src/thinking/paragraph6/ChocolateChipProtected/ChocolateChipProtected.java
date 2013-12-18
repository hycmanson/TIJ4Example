//: access/ChocolateChip.java
// Can't use package-access member from another package.
package thinking.paragraph6.ChocolateChipProtected;

import thinking.paragraph6.CookieProtected.*;

public class ChocolateChipProtected extends CookieProtected {
	public ChocolateChipProtected() {
		// TODO Auto-generated constructor stub
		System.out.println("ChocolateChipProtected constructor");
	}

	public void chomp() {
		bite(); //Can't access bite
	}
}/* Output
CookieProtected constructor
ChocolateChipProtected constructor
bite
 */
