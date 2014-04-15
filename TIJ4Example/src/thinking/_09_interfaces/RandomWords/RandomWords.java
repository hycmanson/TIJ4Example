package thinking._09_interfaces.RandomWords;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

//: interfaces/RandomWords.java
// Implementing an interface to conform to a method.

public class RandomWords implements Readable {
	private Random rand = new Random(47);
	private final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private final char[] vowels = "aeiou".toCharArray();
	private int count;

	public RandomWords(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1; // Indicates end of input
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10; // Number of characters appended
	}

	public RandomWords() {
		Scanner s = new Scanner(new RandomWords(10));
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}/* Output
Yazeruyac
Fowenucor
Goeazimom
Raeuuacio
Nuoadesiw
Hageaikux
Ruqicibui
Numasetih
Kuuuuozog
Waqizeyoy
*///:~
