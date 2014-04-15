package thinking._11_holding.PrintingContainers;

//: holding/PrintingContainers.java
// Containers print themselves automatically.
import static net.mindview.util.Print.*;

import java.text.StringCharacterIterator;
import java.util.*;

public class PrintingContainers {
	static Collection fill(Collection<String> collection) {
		printnb(collection.getClass() + " ");
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}

	static Map fill(Map<String, String> map) {
		printnb(map.getClass() + " ");
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}

	public PrintingContainers() {
		print(fill(new ArrayList<String>()));
		print(fill(new LinkedList<String>()));
		print(fill(new HashSet<String>()));
		print(fill(new TreeSet<String>()));
		print(fill(new LinkedHashSet<String>()));
		print(fill(new HashMap<String, String>()));
		print(fill(new TreeMap<String, String>()));
		print(fill(new LinkedHashMap<String, String>()));
	}
} /*Output
class java.util.ArrayList [rat, cat, dog, dog]
class java.util.LinkedList [rat, cat, dog, dog]
class java.util.HashSet [cat, dog, rat]
class java.util.TreeSet [cat, dog, rat]
class java.util.LinkedHashSet [rat, cat, dog]
class java.util.HashMap {cat=Rags, dog=Spot, rat=Fuzzy}
class java.util.TreeMap {cat=Rags, dog=Spot, rat=Fuzzy}
class java.util.LinkedHashMap {rat=Fuzzy, cat=Rags, dog=Spot}
*/// :~
