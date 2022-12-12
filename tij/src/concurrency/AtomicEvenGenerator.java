package concurrency;
// Atomic classes are occasionally useful in regular code.
// {RunByHand}

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator {
    private final AtomicInteger currentEvenValue =
            new AtomicInteger(0);

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }

    public int next() {
        return currentEvenValue.addAndGet(2);
    }
} ///:~
