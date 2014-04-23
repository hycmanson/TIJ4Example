package thinking._12_exceptions.OnOffSwitch;

//: exceptions/OnOffSwitch.java
// Why use finally?
public class WithFinally {
	private Switch sw = new Switch();

	public WithFinally() {
		try {
			sw.on();
			// Code that can throw exceptions...
			OnOffSwitch.f();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
		} catch (OnOffException2 e) {
			System.out.println("OnOffException2");
		}finally{
			sw.off();
		}
	}
} /* Output
on
off
*///:~
