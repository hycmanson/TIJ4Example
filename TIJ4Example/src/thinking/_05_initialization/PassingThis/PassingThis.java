package thinking._05_initialization.PassingThis;

public class PassingThis {
	public PassingThis() {
		new Person().eat(new Apple());
	}
} /*Output
Yummy
*/
