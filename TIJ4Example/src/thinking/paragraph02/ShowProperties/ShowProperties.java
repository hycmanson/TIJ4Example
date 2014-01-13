//: object/ShowProperties.java
package thinking.paragraph02.ShowProperties;

public class ShowProperties {
	public ShowProperties() {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
} ///:~
