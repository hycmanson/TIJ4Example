package thinking._11_holding.AppleAndOrangesWithoutGenerics;

import java.util.ArrayList;

//: holding/AppleAndOrangesWithoutGenerics.java
// Simple container example (produces compiler warnings).
// {ThrowsException}

public class AppleAndOrangesWithoutGenerics {
	public AppleAndOrangesWithoutGenerics() {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
			// Not prevented from adding an Orange to apples:
		}
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			((Apple) apples.get(i)).id();
			// Orange is detected only at run time
		}
	}
} /* (Execute to see output) *///:~
