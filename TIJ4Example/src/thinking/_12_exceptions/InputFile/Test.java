package thinking._12_exceptions.InputFile;

public class Test {
	public Test() {
		try {
			new InputFile("src/thinking/_12_exceptions/Cleanup/Cleanup.java");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
