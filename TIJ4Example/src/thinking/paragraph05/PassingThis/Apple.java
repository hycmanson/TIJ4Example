package thinking.paragraph05.PassingThis;

public class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
