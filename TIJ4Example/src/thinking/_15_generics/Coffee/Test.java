package thinking._15_generics.Coffee;

public class Test {
	public Test() {
		CoffeeGenerator gen = new CoffeeGenerator();
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for (Coffee c : new CoffeeGenerator(5))
			System.out.println(c);
	}
}
