//: initialization/OverloadingOrder.java
// Overloading based on the order of the arguments.
package thinking.paragraph05.PrimitiveOverloading;

//import static net.mindview.util.Print.*;

public class PrimitiveOverloading {
	public void f1(char x) {System.out.print("f1(char) ");}
	public void f1(byte x) {System.out.print("f1(byte) ");}
	public void f1(short x) {System.out.print("f1(short) ");}
	public void f1(int x) {System.out.print("f1(int) ");}
	public void f1(long x) {System.out.print("f1(long) ");}
	public void f1(float x) {System.out.print("f1(float) ");}
	public void f1(double x) {System.out.print("f1(double) ");}
	public void f2(byte x) {System.out.print("f2(byte) ");}
	public void f2(short x) {System.out.print("f2(short) ");}
	public void f2(int x) {	System.out.print("f2(int) ");}
	public void f2(long x) {System.out.print("f2(long) ");}
	public void f2(float x) {System.out.print("f2(float) ");}
	public void f2(double x) {System.out.print("f2(double) ");}
	public void f3(short x) {System.out.print("f3(short) ");}
	public void f3(int x) {System.out.print("f3(int) ");}
	public void f3(long x) {System.out.print("f3(long) ");}
	public void f3(float x) {System.out.print("f3(float) ");}
	public void f3(double x) {System.out.print("f3(double) ");}
	public void f4(int x) {System.out.print("f4(int) ");}
	public void f4(long x) {System.out.print("f4(long) ");}
	public void f4(float x) {System.out.print("f4(float) ");}
	public void f4(double x) {System.out.print("f4(double) ");}
	public void f5(long x) {System.out.print("f5(long) ");}
	public void f5(float x) {System.out.print("f5(float) ");}
	public void f5(double x) {System.out.print("f5(double) ");}
	public void f6(float x) {System.out.print("f6(float) ");}
	public void f6(double x) {System.out.print("f6(double) ");}
	public void f7(double x) {System.out.print("f7(double) ");}
	public void testConstVal() {System.out.print("5: ");	f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);System.out.println();}
	public void testChar() {char x = 'x';System.out.print("char: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	public void testByte() {byte x = 0;System.out.print("byte: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	public void testShort() {short x = 0;System.out.print("short: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	public void testInt() {int x = 0;System.out.print("int: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	public void testLong() {long x = 0;System.out.print("long: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	public void testFloat() {float x = 0;System.out.print("float: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	public void testDouble() {double x = 0;System.out.print("double: ");f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);System.out.println();}
	
	public PrimitiveOverloading() {
		testConstVal();
		testChar();
		testByte();
		testShort();
		testInt();
		testLong();
		testFloat();
		testDouble();
	}
} /* Output
5: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double) 
char: f1(char) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double) 
byte: f1(byte) f2(byte) f3(short) f4(int) f5(long) f6(float) f7(double) 
short: f1(short) f2(short) f3(short) f4(int) f5(long) f6(float) f7(double) 
int: f1(int) f2(int) f3(int) f4(int) f5(long) f6(float) f7(double) 
long: f1(long) f2(long) f3(long) f4(long) f5(long) f6(float) f7(double) 
float: f1(float) f2(float) f3(float) f4(float) f5(float) f6(float) f7(double) 
double: f1(double) f2(double) f3(double) f4(double) f5(double) f6(double) f7(double) 
 */// :~
