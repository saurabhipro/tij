package rtti;

//It frees you from the constraint of doing type-oriented things only at compile time, and can
//        enable some very powerful programs. The need for RTTI uncovers a plethora of interesting
//        (and often perplexing) 0 0 design issues, and raises fundamental questions about how you
//        should structure your programs. This chapter looks at the ways that Java allows you to
//        discover information about objects and classes at run time. This takes two forms:
//        "traditional" RTTI, which assumes that you have all the types available at compile time, and
//        the reflection mechanism, which allows you to discover and use class information solely at
//        run time.
abstract class Shape {
    void draw() {
        System.out.println(this + ".draw");
    }

    abstract public String toString();

}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle";
    }
}
