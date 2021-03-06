//: initialization/DynamicArray.java
// Array initialization
package thinking._05_initialization.DynamicArray;

public class DynamicArray {
	public DynamicArray() {
		new Other(new String[] { "fiddle", "de", "dum" });
	}

	class Other {
		public Other(String[] args) {
			for (String s : args) {
				System.out.println(s + " ");
			}
		}
	}
} /* Output
fiddle 
de 
dum 
 */
