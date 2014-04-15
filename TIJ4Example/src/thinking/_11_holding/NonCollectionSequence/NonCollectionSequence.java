package thinking._11_holding.NonCollectionSequence;

import java.util.*;

import thinking._14_typeinfo.pets.*;

//: holding/NonCollectionSequence.java

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
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
*///:~
