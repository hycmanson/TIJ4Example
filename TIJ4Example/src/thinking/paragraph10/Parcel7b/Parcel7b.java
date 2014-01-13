package thinking.paragraph10.Parcel7b;

import thinking.paragraph10.TestParcel.Contents;

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
