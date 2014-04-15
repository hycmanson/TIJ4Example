package thinking._11_holding.CollectionSequence;

import thinking._11_holding.InterfaceVsIterator.InterfaceVsIterator;

public class Test {
	public Test() {
		CollectionSequence c = new CollectionSequence();
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	}
}
