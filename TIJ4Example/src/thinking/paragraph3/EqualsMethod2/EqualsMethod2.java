//: operators/EqualsMethod2.java
package thinking.paragraph3.EqualsMethod2;

public class EqualsMethod2 {
	public EqualsMethod2() {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		System.out.println("v1.equals(v2):"+v1.equals(v2));
	}
}/*Output
false
*///:~
