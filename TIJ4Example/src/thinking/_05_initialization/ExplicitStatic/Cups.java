package thinking._05_initialization.ExplicitStatic;

public class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	public Cups() {
		System.out.println("Cups()");
	}
}
