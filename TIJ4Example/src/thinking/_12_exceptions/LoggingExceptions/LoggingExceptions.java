package thinking._12_exceptions.LoggingExceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

//: exceptions/LoggingExceptions.java
// An exception that reports through a Logger.

class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {
	public LoggingExceptions() {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			System.err.println("Caught " + e);
		}
	}
} /* Output
四月 11, 2014 5:01:11 下午 thinking._12_exceptions.LoggingExceptions.LoggingException <init>
严重: thinking._12_exceptions.LoggingExceptions.LoggingException
	at thinking._12_exceptions.LoggingExceptions.LoggingExceptions.<init>(LoggingExceptions.java:23)
	at thinking._12_exceptions.LoggingExceptions.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)

Caught thinking._12_exceptions.LoggingExceptions.LoggingException
四月 11, 2014 5:01:12 下午 thinking._12_exceptions.LoggingExceptions.LoggingException <init>
严重: thinking._12_exceptions.LoggingExceptions.LoggingException
	at thinking._12_exceptions.LoggingExceptions.LoggingExceptions.<init>(LoggingExceptions.java:28)
	at thinking._12_exceptions.LoggingExceptions.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)

Caught thinking._12_exceptions.LoggingExceptions.LoggingException
*///:~
