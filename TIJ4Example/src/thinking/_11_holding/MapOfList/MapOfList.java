package thinking._11_holding.MapOfList;

import java.util.*;
import thinking._14_typeinfo.pets.*;
import static net.mindview.util.Print.*;

//: holding/MapOfList.java

public class MapOfList {
	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly")));
		petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"), new Cat("Stanford aka Stinky el Negro"), new Cat("Pinkola")));
		petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
		petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
	}

	public MapOfList() {
		print("People: " + petPeople.keySet());
		print("Pets: " + petPeople.values());
		for (Person person : petPeople.keySet()) {
			print(person + " has:");
			for (Pet pet : petPeople.get(person)) {
				print("    " + pet);
			}
		}
	}
} /* Output
People: [Person Marilyn, Person Luke, Person Kate, Person Isaac, Person Dawn]
Pets: [[Pug Louie aka Louis Snorkelstein Dupree, Cat Stanford aka Stinky el Negro, Cat Pinkola], [Rat Fuzzy, Rat Fizzy], [Cat Shackleton, Cat Elsie May, Dog Margrett], [Rat Freckly], [Cymric Molly]]
Person Marilyn has:
    Pug Louie aka Louis Snorkelstein Dupree
    Cat Stanford aka Stinky el Negro
    Cat Pinkola
Person Luke has:
    Rat Fuzzy
    Rat Fizzy
Person Kate has:
    Cat Shackleton
    Cat Elsie May
    Dog Margrett
Person Isaac has:
    Rat Freckly
Person Dawn has:
    Cymric Molly
*///:~
