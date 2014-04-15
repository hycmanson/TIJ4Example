package thinking._10_innerclasses.AnonymousConstructor;

public class Test {
	public Test() {
		Base base = AnonymousConstructor.getBase(47);
		base.f();
	}
}
