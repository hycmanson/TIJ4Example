package thinking._12_exceptions.ExceptionSilencer;

//: exceptions/ExceptionSilencer.java
public class ExceptionSilencer {
	public ExceptionSilencer() {
		try {
			throw new RuntimeException();
		} finally {
			// Using 'return' inside the finally block will silence any thrown
			// exception
			return;
		}
	}
} ///:~