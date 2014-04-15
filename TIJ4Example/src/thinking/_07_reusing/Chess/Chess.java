package thinking._07_reusing.Chess;

//: reusing/Chess.java
// Inheritance, constructors and arguments.
import static net.mindview.util.Print.*;

class Game {
	Game(int i) {
		print("Game Constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame Constructor");
	}
}

public class Chess extends BoardGame {
	public Chess() {
		super(11);
		print("Chess Constructor");
	}
}/* Output
Game Constructor
BoardGame Constructor
Chess Constructor
*///:~
