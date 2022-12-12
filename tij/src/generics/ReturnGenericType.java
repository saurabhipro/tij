package generics;

class ReturnGenericType<T extends HasF> {
  private final T obj;
  public ReturnGenericType(T x) { obj = x; }
  public T get() { return obj; }
} ///:~
