package thinking._15_generics.Coffee;

//: generics/Coffee/Coffee.java

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}///:~