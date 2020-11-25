package Examples.ProducerConsumer;
import java.util.concurrent.*;

//Producer-Consumer используя BlockingQueue

public class ProducerConsumerExample3 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(20);

        Thread producer = new Thread(new Producer(queue));
        Thread producer2 = new Thread(new Producer(queue));

        Thread consumer1 = new Thread(new Consumer(queue));
        Thread consumer2 = new Thread(new Consumer(queue));
        Thread consumer3 = new Thread(new Consumer(queue));

        producer.start();
        producer2.start();

        consumer1.start();
        consumer2.start();
        consumer3.start();

    }

    public static class Producer implements Runnable {
        private BlockingQueue<Integer> queue;

        public Producer (BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    queue.put(produce());

                    Thread.sleep(500);
                }

                queue.put(-1);  // indicates end of producing

                System.out.println("Producer STOPPED.");

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        private Integer produce() {
            Integer number = (int) (Math.random() * 100);

            System.out.println("Producing number => " + number);

            return number;
        }
    }

    public static class Consumer implements Runnable {
        private BlockingQueue<Integer> queue;
        private String threadId;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        public void run() {
            threadId = "Consumer-" + Thread.currentThread().getId();
            try {

                while (true) {
                    Integer number = queue.poll(5, TimeUnit.SECONDS);

                    if (number == null || number == -1) {
                        break;
                    }

                    consume(number);

                    Thread.sleep(1000);
                }

                System.out.println(threadId + " STOPPED.");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

        private void consume(Integer number) {

            System.out.println(threadId + ": Consuming number <= " + number);

        }
    }

}
