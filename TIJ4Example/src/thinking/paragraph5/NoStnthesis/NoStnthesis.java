package thinking.paragraph5.NoStnthesis;

//: initialization/NoStnthesis.java

class Bird2 {
	Bird2(int i) {
	}

	Bird2(double d) {
	}
}

public class NoStnthesis {
	public NoStnthesis() {
		// ! Bird2 b = new Bird2();
		Bird2 b2 = new Bird2(1);
		Bird2 b3 = new Bird2(1.0);
	}
} ///:~
