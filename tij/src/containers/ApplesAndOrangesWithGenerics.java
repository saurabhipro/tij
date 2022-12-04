package containers;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        System.out.println("Running the Aples and Oranges with Generics");
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());

        for (Apple c : apples)
            System.out.println(c.id());
    }
}
