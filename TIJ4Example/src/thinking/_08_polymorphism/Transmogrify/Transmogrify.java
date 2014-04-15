package thinking._08_polymorphism.Transmogrify;

//: polymorphism/Transmogrify.java
// Dynamically changing the behavior of an object via composition (the "State" design pattern).

import static net.mindview.util.Print.*;

class Actor {
	public void act() {
	}
}

class Happyactor extends Actor {
	public void act() {
		print("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		print("SadActor");
	}
}

class Stage {
	private Actor actor = new Happyactor();

	public void change() {
		actor = new SadActor();
	}

	public void performPlay() {
		actor.act();
	}
}

public class Transmogrify {
	public Transmogrify() {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}/* Output
HappyActor
SadActor
*///:~
