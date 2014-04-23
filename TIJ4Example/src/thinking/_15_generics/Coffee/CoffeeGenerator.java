package thinking._15_generics.Coffee;

import java.util.*;

import net.mindview.util.*;

//: generics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class, };
	private Random rand = new Random(47);

	public CoffeeGenerator() {
	}

	// For iteration:
	private int size = 0;

	public CoffeeGenerator(int sz) {
		size = sz;
	}

	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
			// Report programmer errors at run time:
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator.this.next();
		}

		public void remove() {
			// Not implemented
			throw new UnsupportedOperationException();
		}
	}

	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
} /* Output
Americano 0
Latte 1
Americano 2
Mocha 3
Mocha 4
Americano 5
Latte 6
Americano 7
Mocha 8
Mocha 9
*///:~
