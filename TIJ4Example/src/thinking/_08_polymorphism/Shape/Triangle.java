package thinking._08_polymorphism.Shape;

//: polymorphism/shape/Triangle.java
import static net.mindview.util.Print.*;

public class Triangle extends Shape {
	public void draw() {
		print("Triangle.draw()");
	}
	public void erase() {
		print("Triangle.erase()");
	}
} ///:~
