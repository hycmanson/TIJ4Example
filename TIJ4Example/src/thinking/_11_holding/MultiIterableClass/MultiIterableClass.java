package thinking._11_holding.MultiIterableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import thinking._11_holding.IterableClass.IterableClass;

//: holding/MultiIterableClass.java
// Adding several Adapter Methods.

public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed() {
		return new Iterable<String>() {
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					int current = words.length - 1;

					public boolean hasNext() {
						return current > -1;
					}

					public String next() {
						return words[current--];
					}

					public void remove() {
						// Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<String> randomized() {
		return new Iterable<String>() {
			public Iterator<String> iterator() {
				List<String> shuffled = new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
} /* Output
banana-shaped. be to Earth the know we how is that And 
is banana-shaped. Earth that how the be And we know to 
And that is how we know the Earth to be banana-shaped. 
*///:~
