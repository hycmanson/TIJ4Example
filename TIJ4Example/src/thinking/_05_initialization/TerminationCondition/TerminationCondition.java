//: initialization/TerminationCondition.java
// Using finalize() to detect an object that hasn't been properly cleaned up

package thinking._05_initialization.TerminationCondition;

public class TerminationCondition {
	public TerminationCondition() {
		// TODO Auto-generated constructor stub
		Book novel = new Book(true);
		// Proper cleanup;
		novel.checkIn();
		// Drop the reference, forget to clean up:
		new Book(true);
		// Force garbage collection & finalization:
		System.gc();
	}
} /*Output:
Errot:checked out
*/