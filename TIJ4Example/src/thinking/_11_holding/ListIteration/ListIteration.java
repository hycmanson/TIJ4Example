package thinking._11_holding.ListIteration;

//: holding/ListIteration.java
import thinking._14_typeinfo.pets.*;
import java.util.*;

public class ListIteration {
	public ListIteration() {
		List<Pet> pets = Pets.arrayList(8);
		ListIterator<Pet> it = pets.listIterator();
		while (it.hasNext()) 
			System.out.println(it.next() + "," + '\t' + "nextIndex:" + it.nextIndex() + "," + '\t' + "previousIndex:"
					+ it.previousIndex() + ";");
		// Backwards
		while (it.hasPrevious()) 
			System.out.print(it.previous().id() + " ");
		System.out.println();
		System.out.println(pets);
		it = pets.listIterator(3);
		while (it.hasNext()) {
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
	}
} /* Output
Rat,	nextIndex:1,	previousIndex:0;
Manx,	nextIndex:2,	previousIndex:1;
Cymric,	nextIndex:3,	previousIndex:2;
Mutt,	nextIndex:4,	previousIndex:3;
Pug,	nextIndex:5,	previousIndex:4;
Cymric,	nextIndex:6,	previousIndex:5;
Pug,	nextIndex:7,	previousIndex:6;
Manx,	nextIndex:8,	previousIndex:7;
7 6 5 4 3 2 1 0 
[Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Manx]
[Rat, Manx, Cymric, Cymric, Rat, EgyptianMau, Hamster, EgyptianMau]
*///:~
