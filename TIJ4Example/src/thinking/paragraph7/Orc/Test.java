package thinking.paragraph7.Orc;

import static net.mindview.util.Print.*;

public class Test {
	public Test() {
		Orc orc = new Orc("Limburher", 12);
		print(orc);
		orc.change("Bob", 19);
		print(orc);
	}
}