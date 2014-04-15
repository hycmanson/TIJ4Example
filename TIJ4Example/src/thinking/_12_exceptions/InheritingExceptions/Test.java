package thinking._12_exceptions.InheritingExceptions;

public class Test {
	public Test() {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("Caught it!");
		}
	}
}
