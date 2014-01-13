package thinking.paragraph09.Music5;

//: interfaces/music5/Music5.java
// Interfaces.
import static net.mindview.util.Print.*;
import thinking.paragraph08.Music.Note;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static & final

	// Cannot have method definitions:
	void play(Note n); // Automatically public

	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	public String toString() {
		return "Wind";
	}
}

class Percussion implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	public String toString() {
		return "Percussion";
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public void adjust() {
		print(this + ".adjust()");
	}

	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {
	// Doesn't care about type, so new types added to the system still work
	// right:
	void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}

	public Music5() {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}/* Output
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~
