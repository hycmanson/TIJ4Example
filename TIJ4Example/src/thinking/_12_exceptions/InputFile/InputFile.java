package thinking._12_exceptions.InputFile;

import java.io.*;

//: exceptions/InputFile.java
// Paying attention to exceptions in constructors.

public class InputFile {
	private BufferedReader in;

	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
			// Other code that might throw exceptions
		} catch (FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			// Wasn't open, so don't close it
			throw e;
		} catch (Exception e) {
			// All other exceptions must close it
			try {
				in.close();
			} catch (IOException e2) {
				System.out.println("in.close() unsuccessful");
			}
			throw e; // Rethrow
		} finally {
			// Don't close it here!!!
		}
	}

	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}

	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		} catch (IOException e) {
			throw new RuntimeException("in.close() failed");
		}
	}
} /*
 * Output Could not open Test java.io.FileNotFoundException: Test (系统找不到指定的文件。)
 * at java.io.FileInputStream.open(Native Method) at
 * java.io.FileInputStream.<init>(Unknown Source) at
 * java.io.FileInputStream.<init>(Unknown Source) at
 * java.io.FileReader.<init>(Unknown Source) at
 * thinking._12_exceptions.InputFile.InputFile.<init>(InputFile.java:13) at
 * thinking._12_exceptions.InputFile.Test.<init>(Test.java:6) at
 * hyc.com.run.Main.main(Main.java:6)
 */// :~
