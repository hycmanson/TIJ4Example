package thinking.paragraph05.Overloading;

public class Tree {
	private int height;

	public Tree() {
		System.out.println("Planting a seeding");
		height = 0;
	}

	public Tree(int initialHeight) {
		height = initialHeight;
		System.out.println("Creating new Tree that is " + height + " feet tall");
	}

	public void info() {
		System.out.println("Tree is " + height + " feet tall");
	}

	public void info(String s) {
		System.out.println(s + ": Tree is " + height + " feet tall");
	}
}
