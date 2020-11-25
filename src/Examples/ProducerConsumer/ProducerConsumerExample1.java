package Examples.ProducerConsumer;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

// ProducerConsumer в чистом виде

public class ProducerConsumerExample1<T>  {

    private static final int BUFFER_MAX_SIZE = 42;

    private List<T> buffer = new LinkedList<>();

    synchronized void produce(T value) throws InterruptedException {
        while (buffer.size() == BUFFER_MAX_SIZE){
            wait();
        }
        buffer.add(value);
        notify();
    }

    synchronized T consume() throws InterruptedException {
        while (buffer.size() == 0){
            wait();
        }
        T result = buffer.remove(0);
        notify();
        return result;
    }
}

