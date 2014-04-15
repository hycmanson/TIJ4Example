package thinking._07_reusing.Wind;

//: reusing/Wind.java
// Inheritance & upcasting.
class Instrument {
	public void play() {
	}

	static void tune(Instrument i) {
		// ...
		i.play();
	}
}

// Wind objects are instruments because they have the same interface:
public class Wind extends Instrument {
}///:~
