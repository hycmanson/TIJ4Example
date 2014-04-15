package thinking._09_interfaces.RandVals;

import java.util.Random;

// :interfaces/RandVals.java
// Initializing interface fields with non-constant initializers.

public interface RandVals {
	Random RAND = new Random(47);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextLong() * 10;
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;
} /* Output
8
-32032247016559954
-8.5939291E18
5.779976127815049
*///:~
