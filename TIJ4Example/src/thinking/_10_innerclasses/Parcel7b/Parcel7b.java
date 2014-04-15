package thinking._10_innerclasses.Parcel7b;

import thinking._10_innerclasses.TestParcel.Contents;

//: innerclasses/Parcel7b.java
// Expanded version of Parcel7.java

public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	public Contents contents() {
		return new MyContents();
	}
} ///:~
