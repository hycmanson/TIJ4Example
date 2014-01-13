package thinking.paragraph08.Music;

//: polymorphism/music/Music.java
// Inheritance & upcasting.

public class Music {
	public void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public Music() {
		Wind flute = new Wind();
		tune(flute); // Upcasting
	}
} /* Output
Wind.play() MIDDLE_C
*///:~
