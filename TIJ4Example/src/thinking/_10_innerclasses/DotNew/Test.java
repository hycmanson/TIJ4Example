package thinking._10_innerclasses.DotNew;

public class Test {
	public Test() {
		DotNew dn = new DotNew();
		DotNew.Inner dbi = dn.new Inner();
	}
}
