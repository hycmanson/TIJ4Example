package thinking._09_interfaces.Adventure;

//: interfaces/Adventure.java
// Multiple interfaces.

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {
	}

	public void fly() {
	}
}

public class Adventure {
	public void t(CanFight x) {
		x.fight();
	}

	public void u(CanSwim x) {
		x.swim();
	}

	public void v(CanFly x) {
		x.fly();
	}

	public void w(ActionCharacter x) {
		x.fight();
	}

	public Adventure() {
		Hero h = new Hero();
		t(h); // Treat it as a CanFight
		u(h); // Treat it as a CanSwim
		v(h); // Treat it as a CanFly
		w(h); // Treat it as an ActionCharacter
	}
} ///:~
