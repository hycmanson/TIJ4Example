package thinking.paragraph6.PrintTest;

//: access/PrintTest.java
// Uses the static printing methods in Print.java

import static net.mindview.util.Print.*;

public class PrintTest {
	public PrintTest() {
		print("Available from now on!");
		print(100);
		print(100L);
		print(3.14159);
	}
} /* Output
Available from now on!
100
100
3.14159
*/
