package thinking._13_strings.Immutable;

//: strings/Immutable.java
import static net.mindview.util.Print.*;

public class Immutable {
	public String upcase(String s) {
		return s.toUpperCase();
	}

	public Immutable() {
		String q = "howdy";
		print(q); // howdy
		String qq = upcase(q);
		print(qq); // HOWDY
		print(q); // howdy
	}
} /* Output
howdy
HOWDY
howdy
*///:~
