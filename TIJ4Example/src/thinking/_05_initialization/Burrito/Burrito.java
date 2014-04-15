//: initialization/Burrito.java
package thinking._05_initialization.Burrito;

import thinking._05_initialization.SimpleEnumUse.Spiciness;

public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This Burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot");
			break;
		case HOT:
		case FLAMING:
			System.out.println("maybe too hot.");
			break;

		default:
			break;
		}
	}
}/* Output
This Burrito is not spicy at all
This Burrito is a little hot
This Burrito is maybe too hot.
*/
