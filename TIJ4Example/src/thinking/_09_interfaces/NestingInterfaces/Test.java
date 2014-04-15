package thinking._09_interfaces.NestingInterfaces;

public class Test {
	public Test() {
		A a = new A();
		// Can't access A.D:
		// ! A.D ad = a.getD();
		// Doesn't return anything nut A.D:
		// ! A.DImp2 di2 = a.getD();
		// Cannot access a member of the interface:
		// ! a.getD().f();
		// Only another A can do anything with getD();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
