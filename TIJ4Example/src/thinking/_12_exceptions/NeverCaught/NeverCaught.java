package thinking._12_exceptions.NeverCaught;

//: exceptions/NeverCaught.java
// Ignoring RuntimeExceptions.
// {ThrowsException}
public class NeverCaught {
	void f() {
		throw new RuntimeException("From f()");
	}

	void g() {
		f();
	}

	public NeverCaught() {
		g();
	}
} /* Output
Exception in thread "main" java.lang.RuntimeException: From f()
	at thinking._12_exceptions.NeverCaught.NeverCaught.f(NeverCaught.java:8)
	at thinking._12_exceptions.NeverCaught.NeverCaught.g(NeverCaught.java:12)
	at thinking._12_exceptions.NeverCaught.NeverCaught.<init>(NeverCaught.java:16)
	at thinking._12_exceptions.NeverCaught.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
*///:~
