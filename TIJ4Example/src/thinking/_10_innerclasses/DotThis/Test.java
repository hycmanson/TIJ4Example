package thinking._10_innerclasses.DotThis;

public class Test {
	public Test() {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
}
