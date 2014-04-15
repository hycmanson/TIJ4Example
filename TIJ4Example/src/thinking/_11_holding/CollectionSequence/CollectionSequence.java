package thinking._11_holding.CollectionSequence;

import java.util.*;

import thinking._14_typeinfo.pets.*;

//: holding/CollectionSequence.java
public class CollectionSequence extends AbstractCollection<Pet> {
	private Pet[] pets = Pets.createArray(8);

	public int size() {
		return pets.length;
	}

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() {
				// Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}
} /* Output
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 
*///:~
