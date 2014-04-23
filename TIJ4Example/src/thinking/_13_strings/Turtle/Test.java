package thinking._13_strings.Turtle;

import java.io.PrintStream;
import java.util.Formatter;

public class Test {
	public Test() {
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
		Turtle terry = new Turtle("Tommy", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}
