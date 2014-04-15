package thinking._11_holding.SimpleIteration;

import java.util.*;
import thinking._14_typeinfo.pets.*;
import static net.mindview.util.Print.*;

//: holding/SimpleIteration.java

public class SimpleIteration {
	public SimpleIteration() {
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			printnb(p.id() + ":" + p + " ");
		}
		print();
		// A simpler approach, when possible:
		for (Pet p : pets) 
			printnb(p.id() + ":" + p + " ");
		print();
		// An Iterator can also remove elements:
		it = pets.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		print(pets);
	}
}/* Output
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 8:Cymric 9:Rat 10:EgyptianMau 11:Hamster 
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 8:Cymric 9:Rat 10:EgyptianMau 11:Hamster 
[Pug, Manx, Cymric, Rat, EgyptianMau, Hamster]
*///:~
