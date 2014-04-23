package thinking._13_strings.SimpleFormat;

//: strings/SimpleFormat.java

public class SimpleFormat {
	public SimpleFormat() {
		int x = 5;
		double y = 5.332542;
		// the old way:
		System.out.println("Row 1: [" + x + " " + y + "]");
		// the new way:
		System.out.format("Row 1: [%d %f]\n", x, y);
		// or
		System.out.printf("Row 1: [%d %f]\n", x, y);
	}
}/* Output
Row 1: [5 5.332542]
Row 1: [5 5.332542]
Row 1: [5 5.332542]
*///:~
