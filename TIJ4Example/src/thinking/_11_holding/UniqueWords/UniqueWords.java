package thinking._11_holding.UniqueWords;

//: holding/UniqueWords.java
import java.util.*;

import net.mindview.util.*;

public class UniqueWords {
	public UniqueWords() {
		Set<String> words = new TreeSet<String>(new TextFile("src\\thinking\\_11_holding\\SetOperations\\SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}
