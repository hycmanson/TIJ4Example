//: operators/Assignment.java
// Assignment with objects is a bit tricky
package thinking._03_operators.Assignment;

public class Assignment {
	public Assignment() {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level: " + t1.level + ",t2.level: "
				+ t2.level);
		t1 = t2;
		System.out.println("2: t1.level: " + t1.level + ",t2.level: "
				+ t2.level);
		t1.level = 27;
		System.out.println("3: t1.level: " + t1.level + ",t2.level: "
				+ t2.level);
	}
} /*Output: 
1: t1.level: 9,t2.level: 47
2: t1.level: 47,t2.level: 47
3: t1.level: 27,t2.level: 27
 */// :~
