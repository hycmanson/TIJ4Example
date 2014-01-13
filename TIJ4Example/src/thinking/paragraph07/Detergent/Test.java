package thinking.paragraph07.Detergent;

import static net.mindview.util.Print.*;

public class Test {
	public Test() {
		// TODO Auto-generated constructor stub
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main();
	}
}
