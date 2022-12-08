package containers;

public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                '}';
    }
}
