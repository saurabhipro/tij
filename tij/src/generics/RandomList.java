package generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private final ArrayList<T> storage = new ArrayList<T>();
    private final Random rand = new Random(47);

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<String>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
    }

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
