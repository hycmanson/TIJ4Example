package thinking.paragraph05.TerminationCondition;

public class Book {
	boolean checkedOut = false;

	public Book(boolean checkedOut) {
		// TODO Auto-generated constructor stub
		this.checkedOut = checkedOut;
	}

	public void checkIn() {
		checkedOut = false;
	}

	protected void finalize() {
		if (checkedOut)
			System.out.println("Errot:checked out");
		// Normally,you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}
