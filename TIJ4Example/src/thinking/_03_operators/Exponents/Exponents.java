//: operators/Exponents.java
// "e" means "10 to the power"
package thinking._03_operators.Exponents;

public class Exponents {
	public Exponents() {
		// TODO Auto-generated constructor stub
		// Uppercase and lowercase 'e' are the same:
		float expFloat = 1.39e-43f;
		float expFloat2 = 1.39E-43f;
		System.out.println("expFloat: " + expFloat);
		System.out.println("expFloat2: " + expFloat2);
		double expDouble = 47e47d; //'d' is optional
		double expDouble2 = 47e47; //Automatically double
		System.out.println("expDouble: " + expDouble);
		System.out.println("expDouble2: " + expDouble2);
	}
} /* Output:
expFloat: 1.39E-43
expFloat2: 1.39E-43
expDouble: 4.7E48
expDouble2: 4.7E48
*/
