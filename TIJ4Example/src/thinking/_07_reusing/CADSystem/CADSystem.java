package thinking._07_reusing.CADSystem;

//: reusing/CADSystem.java
// Ensuring proper cleanup.

import static net.mindview.util.Print.*;

class Shape {
	public Shape(int i) {
		print("Shape constructor");
	}

	void dispose() {
		print("Shape dispose");
	}
}

class Circle extends Shape {
	public Circle(int i) {
		super(i);
		print("Drawing Circle");
	}

	void dispose() {
		print("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape {
	public Triangle(int i) {
		super(i);
		print("Drawing Triangle");
	}

	void dispose() {
		print("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;

	public Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		print("Drawing Line: " + start + ", " + end);
	}

	void dispose() {
		print("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}

public class CADSystem extends Shape {
	private Circle circle;
	private Triangle triangle;
	private Line[] lines = new Line[3];

	public CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j * j);
		}
		circle = new Circle(1);
		triangle = new Triangle(1);
		print("Combined constructor");
	}

	@Override
	public void dispose() {
		print("CABSystem.dispose()");
		// The order of cleanup is reverse of the order of initialization:
		triangle.dispose();
		circle.dispose();
		for (int i = 0; i < lines.length; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}
} /* Output
Shape constructor
Shape constructor
Drawing Line: 0, 0
Shape constructor
Drawing Line: 1, 1
Shape constructor
Drawing Line: 2, 4
Shape constructor
Drawing Circle
Shape constructor
Drawing Triangle
Combined constructor
CABSystem.dispose()
Erasing Triangle
Shape dispose
Erasing Circle
Shape dispose
Erasing Line: 0, 0
Shape dispose
Erasing Line: 1, 1
Shape dispose
Erasing Line: 2, 4
Shape dispose
Shape dispose
*///:~
