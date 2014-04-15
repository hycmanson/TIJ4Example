package thinking._09_interfaces.InterfaceProcessor;

public class Test {
	public Test() {
		new Apply();
		Apply.process(new Upcase(), StringProcessor.s);
		Apply.process(new Downcase(), StringProcessor.s);
		Apply.process(new Splitter(), StringProcessor.s);
	}
}
