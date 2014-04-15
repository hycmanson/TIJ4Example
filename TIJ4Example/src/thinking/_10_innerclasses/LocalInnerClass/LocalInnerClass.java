package thinking._10_innerclasses.LocalInnerClass;

//: innerclasses/LocalInnerClass.java
// Holds a sequence of Objects.
import static net.mindview.util.Print.*;

interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;

	Counter getCounter(final String name) {
		// A local inner class:
		class LocalCounter implements Counter {
			public LocalCounter() {
				// Local inner class can have a constructor
				print("LocalCounter()");
			}

			public int next() {
				printnb(name); // Access local final
				return count++;
			}
		}
		return new LocalCounter();
	}

	// The same thing with an anonymous inner class:
	Counter getCounter2(final String name) {
		return new Counter() {
			// Anonymous inner class cannot have a named constructor, only an
			// instance initializer:
			{
				print("Counter()");
			}

			public int next() {
				printnb(name); // Access local final
				return count++;
			}
		};
	}
} /* Output
LocalCounter()
Counter()
Local inner 0
Local inner 1
Local inner 2
Local inner 3
Local inner 4
Anonymous inner 5
Anonymous inner 6
Anonymous inner 7
Anonymous inner 8
Anonymous inner 9
*///:~
