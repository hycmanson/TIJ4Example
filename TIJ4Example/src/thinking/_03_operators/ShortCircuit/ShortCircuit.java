package thinking._03_operators.ShortCircuit;

public class ShortCircuit {
	public ShortCircuit() {
		// TODO Auto-generated constructor stub
		boolean b = test1(0) && test2(2) && test3(2);
		
	}
	public static boolean test1(int val){
		System.out.println("test1("+ val + ")");
		System.out.println("result: "+ (val < 1));
		return val < 1;
	}
	public static boolean test2(int val){
		System.out.println("test2("+ val + ")");
		System.out.println("result: "+ (val < 2));
		return val < 2;
	}
	public static boolean test3(int val){
		System.out.println("test3("+ val + ")");
		System.out.println("result: "+ (val < 3));
		return val < 3;
	}
}
/* Output
test1(0)
result: true
test2(2)
result: false
*///:~