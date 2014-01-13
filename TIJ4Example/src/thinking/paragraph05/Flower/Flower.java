//: initializtion/Flower.java
// Calling constructors with "this"
package thinking.paragraph05.Flower;

import static net.mindview.util.Print.*;

public class Flower {
	int petalCount = 0;
	String s = "initial value";

	public Flower(int petals) {
		petalCount = petals;
		print("Constructor w/ int arg only, petalCount= " + petalCount);
	}

	public Flower(String ss) {
		s = ss;
		print("Constructor w/ String arg only, s = " + ss);
	}

	public Flower(String s, int petals) {
		this(petals);
		// ! this(s); //Can't call two!
		// Another use of "this"
		this.s = s;
		print("String & int args");
	}

	public Flower() {
		this("hi", 47);
		print("default constructor (no args)");
	}

	void printPetalCount() {
		// ! this(11); //Not inside non-constructor!
		print("petalCount = " + petalCount + " s = " + s);
	}
}
