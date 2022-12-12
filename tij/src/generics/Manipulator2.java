package generics;

class Manipulator2<T extends HasF> {
  private final T obj;
  public Manipulator2(T x) { obj = x; }
  public void manipulate() { obj.f(); }
} ///:~
