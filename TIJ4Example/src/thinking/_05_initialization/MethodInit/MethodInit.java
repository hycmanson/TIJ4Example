package thinking._05_initialization.MethodInit;

public class MethodInit {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MethodInit [i=" + i + ", j=" + j + "]";
	}

	int i = f();
	int j = g(i);

	int f() {
		return 11;
	}

	int g(int n) {
		return n * 10;
	}

	public MethodInit() {
		// TODO Auto-generated constructor stub
		System.out.println(this);
	}
}/* Output
MethodInit [i=11, j=110]
*/
