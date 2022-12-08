package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddingGrpups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Integer[] moreInts = {1, 2, 3};
        Collections.addAll(collection, 12);
        Collections.addAll(collection, moreInts);

    }
}
