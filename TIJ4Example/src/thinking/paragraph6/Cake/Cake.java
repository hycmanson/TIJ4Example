//: access/Cake.java
// Accesses a class in a separate compilation unit.
package thinking.paragraph6.Cake;

public class Cake {
	public Cake() {
		// TODO Auto-generated constructor stub
		Pie x = new Pie();
		x.f();
	}
} /* Output:
Pie.f()
*///:~
