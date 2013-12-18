package thinking.paragraph7.BlankFinal;

//: reusing/BlankFinal.java
// "Blank" final fileds.

class Poppet {
	private int i;

	Poppet(int ii) {
		i = ii;
	}
}

public class BlankFinal {
	private final int i = 0;// Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference

	// Blank finals MUST be initialized in the constructor:
	public BlankFinal() {
		j = 1; // Initialized blank final
		p = new Poppet(1); // Initialized blank final reference
	}

	public BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet(x); // Initialize blank final reference
	}
}///:~
