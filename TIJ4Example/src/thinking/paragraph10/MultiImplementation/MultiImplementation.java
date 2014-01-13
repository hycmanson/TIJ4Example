package thinking.paragraph10.MultiImplementation;

//: innerclasses/MultiImplementation.java
// With concrete or abstract classes, inner classes are the only way to produce the effect of "multiple implementation inheritance."

class D {
}

abstract class E {
}

class Z extends D {
	E makeE() {
		return new E() {
		};
	}
}

public class MultiImplementation {
	void takeD(D d) {
	}

	void takeE(E e) {
	}

	public MultiImplementation() {
		Z z = new Z();
		takeD(z);
		takeE(z.makeE());
	}
} ///:~
