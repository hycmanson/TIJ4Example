package thinking._10_innerclasses.Parcel5;

import thinking._10_innerclasses.TestParcel.Destination;

//: innerclasses/Parcel5.java
// Nesting a class within a method.

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			public PDestination(String whereTo) {
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
} ///:~
