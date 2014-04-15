package thinking._11_holding.ContainerMethods;

//: holding/ContainerMethods.java
import net.mindview.util.*;

public class ContainerMethods {
	public ContainerMethods() {
		ContainerMethodDifferences.main(new String[] {});
	}
}/* Output
Collection: [add, addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll, size, toArray]
Interfaces in Collection: [Iterable]
Set extends Collection, adds: []
Interfaces in Set: [Collection]
HashSet extends Set, adds: []
Interfaces in HashSet: [Set, Cloneable, Serializable]
LinkedHashSet extends HashSet, adds: []
Interfaces in LinkedHashSet: [Set, Cloneable, Serializable]
TreeSet extends Set, adds: [lower, last, higher, descendingIterator, subSet, pollLast, comparator, pollFirst, floor, headSet, ceiling, tailSet, first, descendingSet]
Interfaces in TreeSet: [NavigableSet, Cloneable, Serializable]
List extends Collection, adds: [get, set, listIterator, lastIndexOf, indexOf, subList]
Interfaces in List: [Collection]
ArrayList extends List, adds: [trimToSize, ensureCapacity]
Interfaces in ArrayList: [List, RandomAccess, Cloneable, Serializable]
LinkedList extends List, adds: [offerFirst, removeFirstOccurrence, pop, peekLast, push, descendingIterator, poll, peek, removeFirst, pollLast, getFirst, offerLast, element, removeLast, offer, pollFirst, addLast, addFirst, peekFirst, getLast, removeLastOccurrence]
Interfaces in LinkedList: [List, Deque, Cloneable, Serializable]
Queue extends Collection, adds: [element, offer, poll, peek]
Interfaces in Queue: [Collection]
PriorityQueue extends Queue, adds: [comparator]
Interfaces in PriorityQueue: [Serializable]
Map: [clear, containsKey, containsValue, entrySet, equals, get, hashCode, isEmpty, keySet, put, putAll, remove, size, values]
HashMap extends Map, adds: []
Interfaces in HashMap: [Map, Cloneable, Serializable]
LinkedHashMap extends HashMap, adds: []
Interfaces in LinkedHashMap: [Map]
SortedMap extends Map, adds: [tailMap, firstKey, headMap, comparator, lastKey, subMap]
Interfaces in SortedMap: [Map]
TreeMap extends Map, adds: [pollLastEntry, firstKey, floorEntry, ceilingEntry, lowerEntry, lastEntry, subMap, tailMap, navigableKeySet, higherEntry, lowerKey, headMap, firstEntry, comparator, descendingKeySet, descendingMap, pollFirstEntry, lastKey, higherKey, floorKey, ceilingKey]
Interfaces in TreeMap: [NavigableMap, Cloneable, Serializable]
*///:~