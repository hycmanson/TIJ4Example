package thinking._11_holding.AsListInference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.

class Snow {
}

class Powder extends Snow {
}

class Light extends Snow {
}

class Heavy extends Snow {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInference {
	public AsListInference() {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
		// Won'yt compile:
		// List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		// Compiler says:
		// found : java.util.List<Power>
		// required : java.util.List<Snow>
		// Collections.addAll() doesn't get confused:
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		// Give a hint using an explicit type argument specification:
		List<Snow> snow4 = Arrays.<Snow> asList(new Light(), new Heavy());
	}
}///:~
