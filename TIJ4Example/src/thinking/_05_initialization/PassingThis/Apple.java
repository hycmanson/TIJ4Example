package thinking._05_initialization.PassingThis;

public class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
