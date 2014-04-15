package thinking._11_holding.MultiIterableClass;

public class Test {
	public Test() {
		MultiIterableClass mic = new MultiIterableClass();
		for (String s : mic.reversed())
			System.out.print(s + " ");
		System.out.println();
		for (String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for (String s : mic)
			System.out.print(s + " ");
	}
}
