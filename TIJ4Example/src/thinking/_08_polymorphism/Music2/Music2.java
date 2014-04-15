package thinking._08_polymorphism.Music2;

//: polymorphism/music/Music2.java
// Overloading instead of upcasting.
import static net.mindview.util.Print.*;
import thinking._08_polymorphism.Music.Instrument;
import thinking._08_polymorphism.Music.Note;
import thinking._08_polymorphism.Music.Wind;

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}
}

class Brass extends Instrument {
	public void play(Note n) {
		print("Brass.play() " + n);
	}
}

public class Music2 {
	public void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}

	public void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}

	public void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}

	public Music2() {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
}/* Output
Wind.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
*///:~
