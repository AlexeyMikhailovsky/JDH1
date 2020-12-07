package Examples.Stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        Stream<Integer> generate = Stream.generate(() -> new Random().nextInt(255));
        Stream<Integer> limit = generate.limit(100);
        Stream<Integer> filter = limit.filter(val -> val != 0);
        Stream<Character> map = filter.map(val -> (char) val.intValue());
        Stream<Character> peek = map.peek(val -> System.out.println(val));
        long count = peek.count();

        System.out.println(count);
    }
}
