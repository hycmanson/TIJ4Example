//: control/WhileTest.java
// Demonstrates the while loop
package thinking.paragraph4.WhileTest;

public class WhileTest {
	public boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}

	public WhileTest() {
		// TODO Auto-generated constructor stub
		while (condition())
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");
	}
} /* (Execute to see output) *///:~
