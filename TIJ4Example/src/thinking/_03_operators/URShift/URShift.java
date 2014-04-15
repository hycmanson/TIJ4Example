//: operators/URShift.java
// Test of unsigned right shift.
package thinking._03_operators.URShift;

public class URShift {
	public URShift() {
		// TODO Auto-generated constructor stub
		int i = -1;
		System.out.println("int i = -1:	" + Integer.toBinaryString(i));
		i >>>= 10;
		System.out.println("i >>>= 10:	" + Integer.toBinaryString(i));
		long l = -1;
		System.out.println("long l = -1:	" + Long.toBinaryString(l));
		l >>>= 10;
		System.out.println("l >>>= 10:	" + Long.toBinaryString(l));
		short s = -1;
		System.out.println("short s = -1:	" + Integer.toBinaryString(s));
		s >>>= 10;
		System.out.println("s >>>= 10:	" + Integer.toBinaryString(s));
		byte b = -1;
		System.out.println("byte b = -1:	" + Integer.toBinaryString(b));
		b >>>= 10;
		System.out.println("b >>>= 10:	" + Integer.toBinaryString(b));
		b = -1;
		System.out.println("b = -1:		" + Integer.toBinaryString(b));
		System.out.println("b >>> 10:	" + Integer.toBinaryString(b >>> 10));
	}
} /* Output
This is an example package of Thinking in Java!
int i = -1:	11111111111111111111111111111111
i >>>= 10:	1111111111111111111111
long l = -1:	1111111111111111111111111111111111111111111111111111111111111111
l >>>= 10:	111111111111111111111111111111111111111111111111111111
short s = -1:	11111111111111111111111111111111
s >>>= 10:	11111111111111111111111111111111
byte b = -1:	11111111111111111111111111111111
b >>>= 10:	11111111111111111111111111111111
b = -1:		11111111111111111111111111111111
b >>> 10:	1111111111111111111111
*///:~
