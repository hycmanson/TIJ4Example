package thinking._07_reusing.CADSystem;

public class Test {
	public Test() {
		CADSystem x = new CADSystem(47);
		try {
			// Code and exception handling...
		} finally {
			x.dispose();
		}
	}
}
