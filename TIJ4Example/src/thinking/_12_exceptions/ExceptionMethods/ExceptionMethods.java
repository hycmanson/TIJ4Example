package thinking._12_exceptions.ExceptionMethods;

//: exceptions/ExceptionMethods.java
// Demonstrating the Exception Methods.
import static net.mindview.util.Print.*;

public class ExceptionMethods {
	public ExceptionMethods() {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			print("Caught Exception");
			print("getMessage():" + e.getMessage());
			print("getLocalizedMessage():" + e.getLocalizedMessage());
			print("toString():" + e);
			print("printStackTrace():");
			e.printStackTrace(System.out);
		}
	}
} /* Output
Caught Exception
getMessage():My Exception
getLocalizedMessage():My Exception
toString():java.lang.Exception: My Exception
printStackTrace():
java.lang.Exception: My Exception
	at thinking._12_exceptions.ExceptionMethods.ExceptionMethods.<init>(ExceptionMethods.java:10)
	at thinking._12_exceptions.ExceptionMethods.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
*///:~
