package thinking._12_exceptions.MainException;

import java.io.FileInputStream;

//: exceptions/MainException.java

public class MainException {
	// Pass all exceptions to the console:
	public MainException() throws Exception {
		// Open the file:
		FileInputStream file = new FileInputStream("src/thinking/_12_exceptions/MainException/MainException.java");
		// Use the file ...
		// Close the file:
		file.close();
	}
} ///:~