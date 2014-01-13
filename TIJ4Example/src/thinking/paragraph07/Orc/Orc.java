package thinking.paragraph07.Orc;

//: reusing/Orc.java
// The protected keyword.

class Villain {
	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Villain(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}

public class Orc extends Villain {
	private int orcNumber;

	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		set(name); // Available because it's protected
		this.orcNumber = orcNumber;
	}

	@Override
	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
}/* Output
Orc 12: I'm a Villain and my name is Limburher
Orc 19: I'm a Villain and my name is Bob
*/
