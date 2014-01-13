//: initalization/Demotion.java
// Demotion of primitives and overloading.
package thinking.paragraph05.Demotion;

import static net.mindview.util.Print.*;

public class Demotion {
	void f1(char x) {print("f1(char)");}
	void f1(byte x) {print("f1(byte)");}
	void f1(short x) {print("f1(short)");}
	void f1(int x) {print("f1(int)");}
	void f1(long x) {print("f1(long)");}
	void f1(float x) {print("f1(float)");}
	void f1(double x) {print("f1(double)");}
	
	void f2(char x) {print("f1(char)");}
	void f2(byte x) {print("f1(byte)");}
	void f2(short x) {print("f1(short)");}
	void f2(int x) {print("f1(int)");}
	void f2(long x) {print("f1(long)");}
	void f2(float x) {print("f1(float)");}
	
	void f3(char x) {print("f1(char)");}
	void f3(byte x) {print("f1(byte)");}
	void f3(short x) {print("f1(short)");}
	void f3(int x) {print("f1(int)");}
	void f3(long x) {print("f1(long)");}
	
	void f4(char x) {print("f1(char)");}
	void f4(byte x) {print("f1(byte)");}
	void f4(short x) {print("f1(short)");}
	void f4(int x) {print("f1(int)");}
	
	void f5(char x) {print("f1(char)");}
	void f5(byte x) {print("f1(byte)");}
	void f5(short x) {print("f1(short)");}
	
	void f6(char x) {print("f1(char)");}
	void f6(byte x) {print("f1(byte)");}
	
	void f7(char x) {print("f1(char)");}
	
	void testDouble(){
		double x = 0;
		print("double argument:");
		f1(x);f2((float) x);f3((long) x);f4((int) x);f5((short) x);f6((byte) x);f7((char) x);
	}
	public Demotion(){
		testDouble();
	}
} /* Output
double argument:
f1(double)
f1(float)
f1(long)
f1(int)
f1(short)
f1(byte)
f1(char)
*///:~
