package thinking.paragraph07.Jurassic;

//: reusing/Jurassic.java
// Making an entire class final.

class SmallBrain {
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();

	void f() {
	}
}

// ! class Futher extends Dinosaur{}
// error: Cannot extend final class 'Dinosaur'

public class Jurassic {
}
