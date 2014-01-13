package thinking.paragraph10.Parcel3;

//: innerclasses/Parcel3.java
// Using .new to create instances of inner classes.

public class Parcel3 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}
}///:~
