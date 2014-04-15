package thinking._11_holding.UniqueWordsAlphabetic;

import java.util.*;

import net.mindview.util.TextFile;

//: holding/UniqueWordsAlphabetic.java
// Producing alphabetic listing.
public class UniqueWordsAlphabetic {
	public UniqueWordsAlphabetic() {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("src\\thinking\\_11_holding\\SetOperations\\SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}/* Output
[_11_holding, A, add, addAll, added, B, C, class, Collections, contains, containsAll, D, E, F, false, from, G, H, HashSet, holding, I, import, in, J, java, K, L, M, mindview, N, net, new, Output, package, Print, public, remove, removeAll, removed, Set, set1, set2, SetOperations, split, static, String, thinking, to, true, util, X, Y, Z]
*///:~
