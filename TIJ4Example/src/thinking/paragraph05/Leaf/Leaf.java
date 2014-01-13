//: initalization/Leaf.java
// Simple use of the "this" keyword.
package thinking.paragraph05.Leaf;

public class Leaf {
	int i = 0;

	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public Leaf() {
		increment().increment().increment().print();
	}
} /*Output:
i = 3
*///~