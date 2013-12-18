package thinking.paragraph7.Hide;

//: reusing/Hide.java
// Overloading a base-class method name in a derived class does not hide the base-class versions.
import static net.mindview.util.Print.*;

class Bart extends Homer {
	void doh(Milhouse m) {
		print("doh(Milhouse)");
	}
}

public class Hide {
	public Hide() {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}/* Output
doh(float)
doh(char)
doh(float)
doh(Milhouse)
*/
