package thinking._12_exceptions.WhoCalled;

//: exceptions/WhoCalled.java
// Programmatic access to stack trace information.

public class WhoCalled {
	void f() {
		// Generate an exception to fill in the stack trace
		try {
			throw new Exception();
		} catch (Exception e) {
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}

	void g() {
		f();
	}

	void h() {
		g();
	}

	public WhoCalled() {
		f();
		System.out.println("--------------------------------");
		g();
		System.out.println("--------------------------------");
		h();
	}
} /* Output
f
<init>
<init>
main
--------------------------------
f
g
<init>
<init>
main
--------------------------------
f
g
h
<init>
<init>
main
*///:~
