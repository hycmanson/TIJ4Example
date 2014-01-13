package thinking.paragraph10.Games;

//: innerclasses/Games.java
// Using anonymous inner classes with the Game framework.
import static net.mindview.util.Print.*;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private Checkers() {
	}

	private int moves = 0;
	private static final int MOVES = 3;

	public boolean move() {
		print("Checker move " + moves);
		return ++moves != MOVES;
	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Checkers();
		}
	};
}

class Chess implements Game {
	private Chess() {
	}

	private int moves = 0;
	private static final int MOVES = 4;

	public boolean move() {
		print("Chess move " + moves);
		return ++moves != MOVES;
	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new Chess();
		}
	};
}

public class Games {
	public void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public Games() {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
} /* Output
Checker move 0
Checker move 1
Checker move 2
Chess move 0
Chess move 1
Chess move 2
Chess move 3
*///:~
