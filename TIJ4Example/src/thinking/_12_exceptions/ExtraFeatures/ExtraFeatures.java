package thinking._12_exceptions.ExtraFeatures;

//: exceptions/ExtraFeatures.java
// Further embellishment of exception classes.

import static net.mindview.util.Print.*;

class MyException2 extends Exception {
	private int x;

	public MyException2() {
	}

	public MyException2(String msg) {
		super(msg);
	}

	public MyException2(String msg, int x) {
		super(msg);
		this.x = x;
	}

	public int val() {
		return x;
	}

	public String getMessage() {
		return "Detail Message:" + x + " " + super.getMessage();
	}
}

public class ExtraFeatures {
	public void f() throws MyException2 {
		print("Throwing MyException2 from f()");
		throw new MyException2();
	}

	public void g() throws MyException2 {
		print("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}

	public void h() throws MyException2 {
		print("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()", 47);
	}

	public ExtraFeatures() {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}
} /* Output
Throwing MyException2 from f()
thinking._12_exceptions.ExtraFeatures.MyException2: Detail Message:0 null
	at thinking._12_exceptions.ExtraFeatures.ExtraFeatures.f(ExtraFeatures.java:35)
	at thinking._12_exceptions.ExtraFeatures.ExtraFeatures.<init>(ExtraFeatures.java:50)
	at thinking._12_exceptions.ExtraFeatures.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
Throwing MyException2 from g()
thinking._12_exceptions.ExtraFeatures.MyException2: Detail Message:0 Originated in g()
	at thinking._12_exceptions.ExtraFeatures.ExtraFeatures.g(ExtraFeatures.java:40)
	at thinking._12_exceptions.ExtraFeatures.ExtraFeatures.<init>(ExtraFeatures.java:55)
	at thinking._12_exceptions.ExtraFeatures.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
Throwing MyException2 from h()
thinking._12_exceptions.ExtraFeatures.MyException2: Detail Message:47 Originated in h()
	at thinking._12_exceptions.ExtraFeatures.ExtraFeatures.h(ExtraFeatures.java:45)
	at thinking._12_exceptions.ExtraFeatures.ExtraFeatures.<init>(ExtraFeatures.java:60)
	at thinking._12_exceptions.ExtraFeatures.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
e.val() = 47
*///:~
