// When trying to create snow2, Arrays.asList( ) only has types of Powder, so it creates a
// List<Powder> rather than a List<Snow>, whereas Collections.addAll( ) works fine
// because it knows from the first argument what the target type is.
// As you can see from the creation of snow4, it’s possible to insert a "hint" in the middle of
// Arrays.asList( ), to tell the compiler what the actual target type should be for the resulting
// List type produced by Arrays.asList( ). This is called an explicit type argument
// specification.
// Maps are more complex, as you’ll see, and the Java standard library does not provide any
// way to automatically initialize them, except from the contents of another Map.
package containers;

import java.util.Arrays;
import java.util.List;

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class AsListInterface {
    public static void main(String[] args) {
        List<Snow> snowList1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        List<Snow> snowList2 = Arrays.asList(new Light(), new Heavy());
    }
}