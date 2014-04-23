package thinking._12_exceptions.StormyInning;

public class Test {
	public Test() {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (PopFoul e) {
			System.out.println("Pop foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		// Strike not thrown in derived version.
		try {
			// What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
			// You must catch the exceptions from the base-class version of the method:
		} catch (Strike e) {
			System.out.println("Strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("Rained out");
		} catch (BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
} ///:~