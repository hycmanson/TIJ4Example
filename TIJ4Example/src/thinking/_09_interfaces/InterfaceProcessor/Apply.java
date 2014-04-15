package thinking._09_interfaces.InterfaceProcessor;

//: interface/interfaceprocessor/Apply.java
import static net.mindview.util.Print.*;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
} ///:~
