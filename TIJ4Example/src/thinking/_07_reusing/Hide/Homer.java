package thinking._07_reusing.Hide;

import static net.mindview.util.Print.print;

public class Homer {
	char doh(char c) {
		print("doh(char)");
		return 'd';
	}

	float doh(float f) {
		print("doh(float)");
		return 1.0f;
	}
}
