package thinking._10_innerclasses.Parcel9;

import thinking._10_innerclasses.TestParcel.Destination;

//: innerclasses/Parcel9.java
// An anonymous inner class that performs initialization. A briefer version of Parcel5.java

public class Parcel9 {
	// Argument must be final to use inside anonymous inner class:
	public Destination destination(final String dest){
		return new Destination() {
			private String label = dest;
			public String readLabel() {
				return label;
			}
		};
	}
} ///:~
