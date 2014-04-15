package thinking._09_interfaces.Filters;

//: interfaces/filters/Waveform.java

public class Waveform {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
} ///:~
