//: initialization/InitialValues.java
// Shows default initial values
package thinking.paragraph5.InitialValues;

import static net.mindview.util.Print.*;

public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;

	public void printInitialValues() {
		print("Data type	Initial Values");
		print("boolean	" + t);
		print("char		" + c);
		print("byte		" + b);
		print("short	" + s);
		print("int		" + i);
		print("long		" + l);
		print("float	" + f);
		print("double	" + d);
		print("InitialValues	" + reference);
	}
}