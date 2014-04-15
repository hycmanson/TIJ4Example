package thinking._10_innerclasses.BigEgg2;

//: innerclasses/BigEgg2.java
// Proper inheritance of an inner class.
import static net.mindview.util.Print.*;

class Egg2 {
	protected class Yolk {
		public Yolk() {
			print("Egg2.Yolk()");
		}

		public void f() {
			print("Egg2.Yolk.f()");
		}
	}

	private Yolk y = new Yolk();

	public Egg2() {
		print("new Egg2()");
	}

	public void insertYolk(Yolk yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}
}

public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			print("BigEggs2.Yolk()");
		}

		public void f() {
			print("BigEggs2.Yolk().f()");
		}
	}
	public BigEgg2() {
		insertYolk(new Yolk());
	}
}/* Output
Egg2.Yolk()
new Egg2()
Egg2.Yolk()
BigEggs2.Yolk()
BigEggs2.Yolk().f()
*///:~
