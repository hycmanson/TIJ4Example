package thinking._09_interfaces.Filters;

//: interfaces/filters/Filter.java

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}

	public Waveform process(Waveform input) {
		return input;
	}
} ///:~
