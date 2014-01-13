package thinking.paragraph07.Cartoon;

//: resuing/Cartoon.java
// Constructor calls during inheritance.
import static net.mindview.util.Print.*;

class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing Constructor");
	}
}

public class Cartoon extends Drawing {
	public Cartoon() {
		print("Cartoon Constructor");
	}
}/*Output
Art constructor
Drawing Constructor
Cartoon Constructor
 */// :~
