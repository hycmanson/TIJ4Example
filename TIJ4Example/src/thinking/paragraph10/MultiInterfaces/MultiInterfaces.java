package thinking.paragraph10.MultiInterfaces;

//: innerclasses/MultiInterfaces.java
// Two ways that a class can implement multiple interfaces.
interface A {
}

interface B {
}

class X implements A, B {
}

class Y implements A {
	B makeB() {
		// Anonymous inner class
		return new B() {
		};
	}
}

public class MultiInterfaces {
	static void takeA(A a) {
	}

	static void takeB(B b) {
	}

	public MultiInterfaces() {
		X x = new X();
		Y y = new Y();
		takeA(x);
		takeA(y);
		takeB(x);
		takeB(y.makeB());
	}
}///:~
