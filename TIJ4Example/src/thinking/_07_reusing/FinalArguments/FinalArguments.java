package thinking._07_reusing.FinalArguments;

//: reusing/FinalArguments.java
// Using "final" with with method arguments.
class Gizmo {
	public void spin() {
	}
}

public class FinalArguments {
	void with(final Gizmo g) {
		// ! g =new Gizmo(); // llegal -- g is final
	}

	void without(Gizmo g) {
		g = new Gizmo(); // OK -- g not final
		g.spin();
	}

	// void f(final int i){ i++; } // Can't change
	// You can only read from a final primitive:
	int g(final int i) {
		return i + 1;
	}
}///:~
