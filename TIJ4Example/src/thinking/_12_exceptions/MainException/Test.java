package thinking._12_exceptions.MainException;

public class Test {
	public Test() {
		try {
			new MainException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
