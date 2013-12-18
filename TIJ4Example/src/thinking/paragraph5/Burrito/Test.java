package thinking.paragraph5.Burrito;

import thinking.paragraph5.SimpleEnumUse.Spiciness;

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
