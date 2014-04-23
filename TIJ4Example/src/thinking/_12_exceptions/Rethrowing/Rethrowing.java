package thinking._12_exceptions.Rethrowing;

//: exceptions/Rethrowing.java
// Demonstrating fillInStackTrace()
public class Rethrowing {
	public void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}

	public void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}

	public void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}

	public Rethrowing() {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
} /* Output
originating the exception in f()
Inside g(), e.printStackTrace()
java.lang.Exception: thrown from f()
	at thinking._12_exceptions.Rethrowing.Rethrowing.f(Rethrowing.java:8)
	at thinking._12_exceptions.Rethrowing.Rethrowing.g(Rethrowing.java:13)
	at thinking._12_exceptions.Rethrowing.Rethrowing.<init>(Rethrowing.java:33)
	at thinking._12_exceptions.Rethrowing.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
main: printStackTrace()
java.lang.Exception: thrown from f()
	at thinking._12_exceptions.Rethrowing.Rethrowing.f(Rethrowing.java:8)
	at thinking._12_exceptions.Rethrowing.Rethrowing.g(Rethrowing.java:13)
	at thinking._12_exceptions.Rethrowing.Rethrowing.<init>(Rethrowing.java:33)
	at thinking._12_exceptions.Rethrowing.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
originating the exception in f()
Inside h(), e.printStackTrace()
java.lang.Exception: thrown from f()
	at thinking._12_exceptions.Rethrowing.Rethrowing.f(Rethrowing.java:8)
	at thinking._12_exceptions.Rethrowing.Rethrowing.h(Rethrowing.java:23)
	at thinking._12_exceptions.Rethrowing.Rethrowing.<init>(Rethrowing.java:39)
	at thinking._12_exceptions.Rethrowing.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
main: printStackTrace()
java.lang.Exception: thrown from f()
	at thinking._12_exceptions.Rethrowing.Rethrowing.h(Rethrowing.java:27)
	at thinking._12_exceptions.Rethrowing.Rethrowing.<init>(Rethrowing.java:39)
	at thinking._12_exceptions.Rethrowing.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
*///:~
