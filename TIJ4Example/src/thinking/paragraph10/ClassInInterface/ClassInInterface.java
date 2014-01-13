package thinking.paragraph10.ClassInInterface;

//: innerclasses/ClassInInterface.java
// {main: ClassInnterface$Test}
public interface ClassInInterface {
	void howdy();

	class Test implements ClassInInterface {
		public void howdy() {
			System.out.println("Howdy!");
		}
	}
}/* Output
Howdy!
*///:~
