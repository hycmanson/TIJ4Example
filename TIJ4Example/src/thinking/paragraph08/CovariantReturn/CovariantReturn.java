package thinking.paragraph08.CovariantReturn;

//: polymorphism/CovariantReturn.java
class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain proccess() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {
	public CovariantReturn() {
		Mill m = new Mill();
		Grain g = m.proccess();
		System.out.println(g);
		m = new WheatMill();
		g = m.proccess();
		System.out.println(g);
	}
} /* Output
Grain
Grain
*///:~
