package thinking._11_holding.PetMap;

import java.util.*;
import thinking._14_typeinfo.pets.*;
import static net.mindview.util.Print.*;

//: holding/PetMap.java

public class PetMap {
	public PetMap() {
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));
		petMap.put("My Hamster", new Hamster("Bosco"));
		print(petMap);
		Pet dog = petMap.get("My Dog");
		print(dog);
		print(petMap.containsKey("My Dog"));
		print(petMap.containsValue(dog));
	}
} /* Output
{My Cat=Cat Molly, My Dog=Dog Ginger, My Hamster=Hamster Bosco}
Dog Ginger
true
true
*///:~
