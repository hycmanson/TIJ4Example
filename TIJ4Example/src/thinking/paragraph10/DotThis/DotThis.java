package thinking.paragraph10.DotThis;

//: innerclasses/DotThis.java
// Qualifying access to the outer-class object.

public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis outer() {
			return DotThis.this;
			// A plain "this" would be Inner's "this"
		}
	}

	public Inner inner() {
		return new Inner();
	}
} /* Output
DotThis.f()
*///:~
