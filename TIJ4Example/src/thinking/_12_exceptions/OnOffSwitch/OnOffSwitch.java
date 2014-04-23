package thinking._12_exceptions.OnOffSwitch;

//: exceptions/OnOffSwitch.java
// Why use finally?
public class OnOffSwitch {
	private Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2 {
	}

	public OnOffSwitch() {
		try {
			sw.on();
			// Code that can throw exceptions...
			f();
			sw.off();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		} catch (OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		}
	}
} /* Output
on
off
*///:~
