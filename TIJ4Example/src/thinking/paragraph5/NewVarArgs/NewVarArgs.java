//: initialization/NewVarArgs.java
// Using array syntax to create variable argument list.
package thinking.paragraph5.NewVarArgs;

class A{}
public class NewVarArgs {
	static void printArray(Object... args) {
		for (Object object : args) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

	public NewVarArgs() {
		// Can take individual elements:
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14f, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		// Or an array:
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		// Empty list is OK
		printArray();
	}
}/* Output:(75% match)
47 3.14 11.11 
47 3.14 11.11 
one two three 
thinking.paragraph5.NewVarArgs.A@175d6ab thinking.paragraph5.NewVarArgs.A@160a26f thinking.paragraph5.NewVarArgs.A@1484a05 
1 2 3 4 
*/
