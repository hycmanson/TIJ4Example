package thinking._11_holding.StackTest;

import net.mindview.util.Stack;

//: holding/StackTest.java

public class StackTest {
	public StackTest() {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
} /* Output
fleas has dog My 
*///:~
