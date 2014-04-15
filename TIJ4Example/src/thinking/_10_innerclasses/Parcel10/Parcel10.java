package thinking._10_innerclasses.Parcel10;

import thinking._10_innerclasses.TestParcel.Destination;

//: innerclasses/Parcel10.java
// Using "instance initialization" to perform construction on an anonymous inner class.

public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;

			// Instance initialization for each object:
			{
				cost = Math.round(price);
				if (cost > 100)
					System.out.println("Over budget!");
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}
} /* Output
Over budget!
*///:~
