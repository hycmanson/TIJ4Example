package thinking._05_initialization.ExplicitStatic;

public class ExplicitStatic {
	public ExplicitStatic() {
		System.out.println("Inside main()");
		Cups.cup1.f(99);			//(1)
	}

	static Cups cups1 = new Cups();	//(2)
	static Cups cups2 = new Cups();	//(2)
} /* Output
Cup(1)
Cup(2)
Cups()
Cups()
Inside main()
f(99)
*/
