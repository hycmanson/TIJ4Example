package thinking._09_interfaces.Apply;

//: interfaces/classprocessor/Apply.java

import static net.mindview.util.Print.*;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		// The split() argument divides a String into pieces:
		return Arrays.toString(((String) input).split(" "));
	}
}

public class Apply {
	public void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}

	public String s = "Disagreement with beliefs is by definition incorrect";

	public Apply() {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}
