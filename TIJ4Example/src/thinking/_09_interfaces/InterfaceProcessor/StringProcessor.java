package thinking._09_interfaces.InterfaceProcessor;

import java.util.Arrays;

//: interfaces/interfaceprocessor/StringProcessor.java

public abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);

	public static String s = "If she weighs the same as a duck, she's made of wood";
}

class Upcase extends StringProcessor {
	public String process(Object input) {
		// Covariant return
		return ((String) input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}/* Output
Using Processor Upcase
IF SHE WEIGHS THE SAME AS A DUCK, SHE'S MADE OF WOOD
Using Processor Downcase
if she weighs the same as a duck, she's made of wood
Using Processor Splitter
[If, she, weighs, the, same, as, a, duck,, she's, made, of, wood]
*///:~