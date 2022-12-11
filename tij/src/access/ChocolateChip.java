//: access/ChocolateChip.java
// Can't use package-access member from another package.
package access;

import access.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }

    public void chomp() {
        //! bite(); // Can't access bite
    }
} /* Output:
Cookie constructor
ChocolateChip constructor
*///:~
