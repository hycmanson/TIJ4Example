package thinking.paragraph08.PrivateOverride;

//: polymorphism/PrivateOverride.java
// Trying to override a private method.

import static net.mindview.util.Print.*;

public class PrivateOverride {
	private void f() {
		print("private f()");
	}
	public void test(){
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		print("public f()");
	}
}/* Output
private f()
*///:~
