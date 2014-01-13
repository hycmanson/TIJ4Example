package thinking.paragraph05.OverloadingVarargs3;

//: initialization/OverloadingVarargs3.java

public class OverloadingVarargs3 {
	void f(float i, Character... args) {
		System.out.println("first");
	}

	void f(char c, Character... args) {
		System.out.println("second");
	}

	public OverloadingVarargs3() {
		f(1, 'a');
		f('a', 'b');
	}
} /* Output
first
second
*///:~
