//: operators/Casting.java
package thinking.paragraph03.Casting;

public class Casting {
	public Casting() {
		// TODO Auto-generated constructor stub
		int i = 200;
		long lng = (long)i;
		lng = i; // "Widening," so cast not really required
		long lng2 = (long)200;
		lng2 = 200;
		//A "narrowing conversion":
		i = (int)lng2; // Cast required
	}
} ///:~
