package rtti;

class Candy {
    static {
        System.out.println(" Loading the Candy............");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum..................");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie..................");
    }

    public Cookie() {
        System.out.println("Calling Cookie Constructor.........");
    }
}


class SweetShop {
    public static void main(String[] args) {
        System.out.println("Inside Main ()");
        new Candy();
        System.out.println("Created Candy()");
        try {
            Class.forName("Candy");
        } catch (ClassNotFoundException e) {
            System.out.println("Count Not find the Gum !!");
        } finally {
            System.out.println("--------Calling the Finally Clause--------");
        }
        new Cookie();
        System.out.println("After Creating Cookie !!");
    }
}
