package thinking._12_exceptions.RethrowNew;

//: exceptions/RethrowNew.java
// Rethrow a different object from the one that was caught.

class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}

public class RethrowNew {
	public void f() throws OneException {
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}

	public RethrowNew() {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			System.out.println("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
} /* Output
originating the exception in f()
Caught in inner try, e.printStackTrace()
thinking._12_exceptions.RethrowNew.OneException: thrown from f()
	at thinking._12_exceptions.RethrowNew.RethrowNew.f(RethrowNew.java:21)
	at thinking._12_exceptions.RethrowNew.RethrowNew.<init>(RethrowNew.java:27)
	at thinking._12_exceptions.RethrowNew.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
Caught in outer try, e.printStackTrace()
thinking._12_exceptions.RethrowNew.TwoException: from inner try
	at thinking._12_exceptions.RethrowNew.RethrowNew.<init>(RethrowNew.java:31)
	at thinking._12_exceptions.RethrowNew.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
*///:~
