package thinking.paragraph05.OrderOfInitialization;

public class House {
	Window w1 = new Window(1); // Before constructor
	public House() {
		// TODO Auto-generated constructor stub
		// Show that we're in the constructor:
		System.out.println("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f(){
		System.out.println("f()");
	}
	Window w3 = new Window(3);
}
