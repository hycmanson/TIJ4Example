package thinking._13_strings.InfiniteRecursion;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public Test() {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);
	}
}
