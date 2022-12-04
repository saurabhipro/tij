package containers;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        apples.add(new Orange());

        for (int i = 0; apples.size() > i; i++) {
            apples.get(i);
            System.out.println(apples.get(i));
        }
    }
}
