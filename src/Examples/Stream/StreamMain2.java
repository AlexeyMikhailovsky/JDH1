package Examples.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamMain2 {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>(100);

        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            data.add(rnd.nextInt(255));
        }

        long count=0;
        for (int i = 0; i < 100; i++) {
            if (data.get(i) != 0){
                int gh = data.get(i);
                char c = (char) gh;
                System.out.println(c);
                count++;
            }
        }

        /*long count = Stream
                .generate(() -> new Random().nextInt(255))
                .limit(100)
                .filter(val -> val != 0)
                .map(val -> (char) val.intValue())
                .peek(System.out::println)
                .count();*/

        System.out.println(count);
    }
}
