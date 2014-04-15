package thinking._07_reusing.Car;

public class Test {
	public Test() {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
	}
}
