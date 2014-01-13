package thinking.paragraph09.AdaptedRandomDoubles;

import java.util.Scanner;

public class Test {
	public Test() {
		Scanner s = new Scanner(new AdaptedRandomDoubles(7));
		while (s.hasNext()) {
			System.out.println(s.nextDouble() + " ");
		}
	}
}
