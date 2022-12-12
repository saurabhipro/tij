package containers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface foo {
    void foo();
}

class GrannySmith extends Apple implements foo {

    public void foo() {
        System.out.println("Foo");
    }
}

class Gala extends Apple implements  foo {
    public void foo() {
        System.out.println("Foo2");
    }
}

class Fuji extends Apple implements foo {
    public void foo() {
        System.out.println("Foo 3");
    }
}

class Braeburn extends Apple  implements foo{
    @Override
    public void foo() {

    }
}


public class GenericsWithUpcasting {
    public static void main(String[] args) {
        List<Apple> applesList = new LinkedList<Apple>();
        applesList.add(new GrannySmith());
        applesList.add(new Gala());
        applesList.add(new Fuji());
        applesList.add(new Braeburn());
        for (var a : applesList) {
            System.out.println(a);
        }
    }
}
