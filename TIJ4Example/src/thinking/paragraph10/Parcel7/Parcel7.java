package thinking.paragraph10.Parcel7;

import thinking.paragraph10.TestParcel.Contents;

//: innerclasses/Parcel7.java
// Returning an instance of an anonymous inner class.

public class Parcel7 {
	public Contents contents() {
		return new Contents() { // Insert a class definition
			private int i = 11;
			public int value() {
				return i;
			}
		}; // Semicolon required in this case
	}
} ///:~
