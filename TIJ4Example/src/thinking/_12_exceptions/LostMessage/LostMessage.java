package thinking._12_exceptions.LostMessage;

//: exceptions/LostMessage.java
// How an exception can be lost.

class VeryTmportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception!";
	}
}

public class LostMessage {
	void f() throws VeryTmportantException {
		throw new VeryTmportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}
} /* Output
A trivial exception!
*///:~
