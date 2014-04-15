//: initialization/EnumOrder.java
package thinking._05_initialization.EnumOrder;

import thinking._05_initialization.SimpleEnumUse.Spiciness;

public class EnumOrder {
	public EnumOrder() {
		// TODO Auto-generated constructor stub
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}
}/* Output
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
*/
