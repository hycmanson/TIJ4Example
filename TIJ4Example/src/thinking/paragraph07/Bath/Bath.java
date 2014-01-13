package thinking.paragraph07.Bath;

//: reusing/Bath.java
// Constructor initialization with composition.
import static net.mindview.util.Print.*;

class Soap {
	private String s;

	Soap() {
		print("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class Bath {
	// Initializing at point of definition:
	private String s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;

	public Bath() {
		print("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}

	// Instance initialization:
	{
		System.out.println("Instance initialization");
		i = 47;
	}

	public String toString() {
		// Delayed initialization:
		if (s4 == null)
			s4 = "Joy";
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n"
				+ "s4 = " + s4 + "\n" + "i = " + i + "\n" + "toy = " + toy
				+ "\n" + "castille = " + castille;
	}
} /*Output: 
Instance initialization
Inside Bath()
Soap()
s1 = Happy
s2 = Happy
s3 = Joy
s4 = Joy
i = 47
toy = 3.14
castille = Constructed
 */// :~