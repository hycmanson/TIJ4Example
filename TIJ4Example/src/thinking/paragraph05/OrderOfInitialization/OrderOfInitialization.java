//: initialization/OrderOfInitialization.java
// Demonstrates initialization order
// When the constructor is called to create a window object, you'll see a message.
package thinking.paragraph05.OrderOfInitialization;

public class OrderOfInitialization {
	public OrderOfInitialization() {
		// TODO Auto-generated constructor stub
		House house = new House();
		house.f(); // Shows that construction is done
	}
}/* Output
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
*///:~
