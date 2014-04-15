package thinking._12_exceptions.InheritingExceptions;

//: exceptions/InheritingExceptions.java
// Creating your own exceptions.
class SimpleException extends Exception {
}

public class InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}
} /* Output
Throw SimpleException from f()
Caught it!
*///:~
