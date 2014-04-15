package thinking._05_initialization.Burrito;

import thinking._05_initialization.SimpleEnumUse.Spiciness;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
		Burrito plain = new Burrito(Spiciness.NOT), greenChile = new Burrito(
				Spiciness.MEDIUM), jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}
}
