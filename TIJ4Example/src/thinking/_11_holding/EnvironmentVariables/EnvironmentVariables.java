package thinking._11_holding.EnvironmentVariables;

import java.util.Map;

//: holding/EnvironmentVariables.java

public class EnvironmentVariables {
	public EnvironmentVariables() {
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
} /* (Execute to see output) *///:~
