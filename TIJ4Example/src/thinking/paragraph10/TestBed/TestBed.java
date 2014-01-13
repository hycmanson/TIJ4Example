package thinking.paragraph10.TestBed;

//: innerclasses/TestBed.java
// Putting test code in anested class.
// {main: TestBed$Tester}
public class TestBed {
	public void f() {
		System.out.println("f()");
	}

	public static class Tester {
		public Tester() {
			TestBed t = new TestBed();
			t.f();
		}
	}
}/* Output
f()
*///:~
