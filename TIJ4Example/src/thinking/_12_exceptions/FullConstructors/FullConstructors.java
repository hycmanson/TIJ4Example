package thinking._12_exceptions.FullConstructors;

//: exceptions/FullConstructors.java

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}

}

public class FullConstructors {
	public void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public void g() throws MyException {
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}

	public FullConstructors() {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
} /* Output
Throwing MyException from f()
thinking._12_exceptions.FullConstructors.MyException
	at thinking._12_exceptions.FullConstructors.FullConstructors.f(FullConstructors.java:18)
	at thinking._12_exceptions.FullConstructors.FullConstructors.<init>(FullConstructors.java:28)
	at thinking._12_exceptions.FullConstructors.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
Throwing MyException from g()
thinking._12_exceptions.FullConstructors.MyException: Originated in g()
	at thinking._12_exceptions.FullConstructors.FullConstructors.g(FullConstructors.java:23)
	at thinking._12_exceptions.FullConstructors.FullConstructors.<init>(FullConstructors.java:33)
	at thinking._12_exceptions.FullConstructors.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
*///:~
