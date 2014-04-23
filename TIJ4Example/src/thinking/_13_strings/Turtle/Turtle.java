package thinking._13_strings.Turtle;

//: strings/Turtle.java
import java.util.*;

public class Turtle {
	private String name;
	private Formatter f;

	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}

	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
	}
} /* Output
Tommy The Turtle is at (0,0)
Tommy The Turtle is at (4,8)
Tommy The Turtle is at (3,4)
Tommy The Turtle is at (2,5)
Tommy The Turtle is at (3,3)
Tommy The Turtle is at (3,3)
*///:~
