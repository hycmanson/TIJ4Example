package thinking.paragraph10.Parcel8;

//: innerclasses/Parcel8.java
// Calling the base-class constructor.

public class Parcel8 {
	public Wrapping wrapping(int x) {
		// Base constructor call:
		return new Wrapping(x) { // Pass constructor argument.
			public int value() {
				return super.value() * 47;
			}
		}; // Semicolon required
	}
}///:~
