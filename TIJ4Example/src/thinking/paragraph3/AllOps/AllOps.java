//: operators/AllOps.java
//Tests all the operators on all the primitive data types
//to show which ones are accepted by the Java compiler.
package thinking.paragraph3.AllOps;

public class AllOps {
	public AllOps() {
		// TODO Auto-generated constructor stub
		boolTest(true, false);
		byte bx = 0, by = 0;
		byteTest(bx, by);
		charTest('a', 'b');
		doubleTest(0.0, 0.0);
		float fx = 0, fy = 0;
		floatTest(fx, fy);
		intTest(1, 1);
		longTest(1, 1);
		short sx = 0, sy = 0;
		shortTest(sx, sy);
	}

	// To accept the results of a boolean test:
	public void f(boolean b) {
	}

	public void boolTest(boolean x, boolean y) {
		// Arithmetic operators:
		// ! x = x * y;
		// ! x = x / y;
		// ! x = x % y;
		// ! x = x + y;
		// ! x = x - y;
		// ! x++;
		// ! x--;
		// ! x = +y;
		// ! x = -y;
		// Relational and logical;
		// ! f(x > y);
		// ! f(x >= y);
		// ! f(x < y);
		// ! f(x <= y);
		f(x == y);
		f(x != y);
		f(!y);
		x = x && y;
		x = x || y;
		// Bitwise operators:
		// ! x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>> 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		// ! char c = (char)x;
		// ! byte b = (byte)x;
		// ! short s = (short)x;
		// ! int i = (int)x;
		// ! long l = (long)x;
		// ! float f = (float)x;
		// ! double d = (double)x;
	}

	public void charTest(char x, char y) {
		// Arithmetic operators:
		x = (char) (x * y);
		x = (char) (x / y);
		x = (char) (x % y);
		x = (char) (x + y);
		x = (char) (x - y);
		x++;
		x--;
		x = (char) +y;
		x = (char) -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x && y);
		// ! f(X || y);
		// Bitwise operators:
		x = (char) ~y;
		x = (char) (x & y);
		x = (char) (x | y);
		x = (char) (x ^ y);
		x = (char) (x << 1);
		x = (char) (x >> 1);
		x = (char) (x >>> 1);
		// Compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	public void byteTest(byte x, byte y) {
		// Arithmetic operators:
		x = (byte) (x * y);
		x = (byte) (x / y);
		x = (byte) (x % y);
		x = (byte) (x + y);
		x = (byte) (x - y);
		x++;
		x--;
		x = (byte) +y;
		x = (byte) -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x&&y);
		// ! f(x||y);
		// Bitwise operators:
		x = (byte) ~y;
		x = (byte) (x & y);
		x = (byte) (x | y);
		x = (byte) (x ^ y);
		x = (byte) (x << 1);
		x = (byte) (x >> 1);
		x = (byte) (x >>> 1);
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	public void shortTest(short x, short y) {
		// Arithmetic operators:
		x = (short) (x * y);
		x = (short) (x / y);
		x = (short) (x % y);
		x = (short) (x + y);
		x = (short) (x - y);
		x++;
		x--;
		x = (short) +y;
		x = (short) -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x&&y);
		// ! f(x||y);
		// Bitwise operators:
		x = (short) ~y;
		x = (short) (x & y);
		x = (short) (x | y);
		x = (short) (x ^ y);
		x = (short) (x << 1);
		x = (short) (x >> 1);
		x = (short) (x >>> 1);
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	public void intTest(int x, int y) {
		// Arithmetic operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x&&y);
		// ! f(x||y);
		// Bitwise operators:
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	public void longTest(long x, long y) {
		// Arithmetic operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x&&y);
		// ! f(x||y);
		// Bitwise operators:
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	public void floatTest(float x, float y) {
		// Arithmetic operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x&&y);
		// ! f(x||y);
		// Bitwise operators:
		// ! x = ~y;
		// ! x = x & y;
		// ! x = x | y;
		// ! x = x ^ y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		// ! x <<= 1;
		// ! x >>= 1;
		// ! x >>>= 1;
		// ! x &= y;
		// ! x ^= y;
		// ! x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	public void doubleTest(double x, double y) {
		// Arithmetic operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		// ! f(!x);
		// ! f(x&&y);
		// ! f(x||y);
		// Bitwise operators:
		// ! x = ~y;
		// ! x = x & y;
		// ! x = x | y;
		// ! x = x ^ y;
		// ! x = x << 1;
		// ! x = x >> 1;
		// ! x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		// ! x <<= 1;
		// ! x >>= 1;
		// ! x >>>= 1;
		// ! x &= y;
		// ! x ^= y;
		// ! x |= y;
		// Casting:
		// ! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}
} // /:~