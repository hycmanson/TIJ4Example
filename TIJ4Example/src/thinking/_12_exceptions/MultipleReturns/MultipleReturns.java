package thinking._12_exceptions.MultipleReturns;

//: exceptions/MultipleReturns.java
import static net.mindview.util.Print.*;

public class MultipleReturns {
	void f(int i) {
		print("Initialization that requires cleanup");
		try {
			print("Point 1");
			if (i == 1)
				return;
			print("Point 2");
			if (i == 2)
				return;
			print("Point 3");
			if (i == 3)
				return;
			print("End");
			return;
		} finally {
			print("Performing cleanup");
		}
	}

	public MultipleReturns() {
		for (int i = 1; i <= 4; i++) {
			f(i);
		}
	}
} /* Output
Initialization that requires cleanup
Point 1
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
End
Performing cleanup
*///:~
