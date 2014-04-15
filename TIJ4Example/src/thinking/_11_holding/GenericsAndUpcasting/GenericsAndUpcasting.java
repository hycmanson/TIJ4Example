package thinking._11_holding.GenericsAndUpcasting;

import java.util.ArrayList;

import thinking._11_holding.AppleAndOrangesWithoutGenerics.Apple;

//: holding/GenericsAndUpcasting.java
class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}

public class GenericsAndUpcasting {
	public GenericsAndUpcasting() {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple c : apples) {
			System.out.println(c);
		}
	}
}/* Output
thinking.paragraph11.GenericsAndUpcasting.GrannySmith@b8f8eb
thinking.paragraph11.GenericsAndUpcasting.Gala@1de17f4
thinking.paragraph11.GenericsAndUpcasting.Fuji@1f6ba0f
thinking.paragraph11.GenericsAndUpcasting.Braeburn@1313906
*///:~

