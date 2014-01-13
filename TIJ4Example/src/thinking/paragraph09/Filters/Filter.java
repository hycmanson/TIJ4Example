package thinking.paragraph09.Filters;

//: interfaces/filters/Filter.java

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}

	public Waveform process(Waveform input) {
		return input;
	}
} ///:~
