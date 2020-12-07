package Examples.Stream.func;

import java.util.Random;
import java.util.function.Supplier;

public class IntGen implements Supplier<Integer> {

    private final Random rnd;

    public IntGen(Random rnd) {
        this.rnd = new Random(255);
    }

    @Override
    public Integer get() {
        return null;
    }
}
