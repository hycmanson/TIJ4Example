package thinking._07_reusing.SpaceShipControls;

//:resuing/SpaceShip.java

public class SpaceShip extends SpaceShipControls {
	private String name;

	public SpaceShip(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
} ///:~
