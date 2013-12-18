package thinking.paragraph3.TernaryIfElse;

public class TernaryIfElse {
	public TernaryIfElse() {
		// TODO Auto-generated constructor stub
		System.out.println("ternary(9):	" + ternary(9));
		System.out.println("ternary(10):	" + ternary(10));
		System.out.println("standardIfElse(9):	" + standardIfElse(9));
		System.out.println("standardIfElse(10):	" + standardIfElse(10));
	}

	public int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}

	public int standardIfElse(int i) {
		if (i < 10)
			return i * 100;
		else
			return i * 10;
	}
} /* Output:
ternary(9):	900
ternary(10):	100
standardIfElse(9):	900
standardIfElse(10):	100
*///:~
