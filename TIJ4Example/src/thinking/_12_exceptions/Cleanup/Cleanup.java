package thinking._12_exceptions.Cleanup;

import thinking._12_exceptions.InputFile.InputFile;

//: exceptions/Cleanup.java
// Guaranteeing proper cleanup of a resource.

public class Cleanup {
	public Cleanup() {
		try {
			InputFile in = new InputFile("src/thinking/_12_exceptions/Cleanup/Cleanup.java");
			try {
				String s;
				int i = 1;
				while ((s = in.getLine()) != null)
					; // Perform line-by-line processing here...
			} catch (Exception e) {
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch (Exception e) {
			System.out.println("InputFile construction failed");
		}
	}
} /* Output
dispose() successful
*///:~
