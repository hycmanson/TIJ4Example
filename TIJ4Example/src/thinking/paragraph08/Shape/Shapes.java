package thinking.paragraph08.Shape;

//: polymorphism/Shapes.java
// Polymorphism in Java/

public class Shapes {
	private RandomShapeGenerator gen = new RandomShapeGenerator();

	public Shapes() {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		// Make polymorphic method calls:
		for (Shape shp : s) {
			shp.draw();
		}
	}
} /* Output
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
