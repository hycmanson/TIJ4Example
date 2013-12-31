package thinking.paragraph9.HorrorShow;

//: interfaces/HorrorShow.java
// Extending an interface with inheritance

interface Monster {
	void menace();
}

interface DangerousMnoster extends Monster {
	void destory();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMnoster {
	public void menace() {
	}

	public void destory() {
	}
}

interface Vampire extends DangerousMnoster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
	}

	public void destory() {
	}

	public void kill() {
	}

	public void drinkBlood() {
	}
}

public class HorrorShow {
	void u(Monster b) {
		b.menace();
	}

	void v(DangerousMnoster d) {
		d.menace();
		d.destory();
	}

	void w(Lethal l) {
		l.kill();
	}

	public HorrorShow() {
		DangerousMnoster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
} ///:~
