package thinking._10_innerclasses.LocalInnerClass;

public class Test {
	public Test() {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local inner "), c2 = lic.getCounter2("Anonymous inner ");
		for (int i = 0; i < 5; i++)
			System.out.println(c1.next());
		for (int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
}
