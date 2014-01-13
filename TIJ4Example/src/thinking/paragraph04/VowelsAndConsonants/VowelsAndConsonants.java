package thinking.paragraph04.VowelsAndConsonants;

import java.util.Random;

import net.mindview.util.Print;

public class VowelsAndConsonants {
	public VowelsAndConsonants() {
		// TODO Auto-generated constructor stub
		Random random = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = random.nextInt(26) + 'a';
			Print.printnb((char) c + "," + c + ":");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				Print.print("vowel");
				break;
			case 'y':
			case 'w':
				Print.print("Sometimes a vowel");
				break;
			default:
				Print.print("consonant");
			}
		}
	}
} /* Output
y,121:Sometimes a vowel
n,110:consonant
z,122:consonant
b,98:consonant
r,114:consonant
n,110:consonant
y,121:Sometimes a vowel
g,103:consonant
â€¦â?
*///~
