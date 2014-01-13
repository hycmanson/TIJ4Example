package thinking.paragraph10.Parcel3;

public class Test {
	public Test() {
		Parcel3 p = new Parcel3();
		// Must use instance of outer class to create an instance of the inner
		// class:
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
	}
}
