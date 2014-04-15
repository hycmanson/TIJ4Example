package thinking._09_interfaces.RandomDoubles;

import java.util.Random;

//: interface/RandomDoubles.java

public class RandomDoubles {
	private Random rand = new Random(47);

	public double next() {
		return rand.nextDouble();
	}
} /* Output
0.7271157860730044 
0.5309454508634242 
0.16020656493302599 
0.18847866977771732 
0.5166020801268457 
0.2678662084200585 
0.2613610344283964 
*///:~
