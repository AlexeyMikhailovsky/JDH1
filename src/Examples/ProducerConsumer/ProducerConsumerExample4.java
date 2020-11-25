package Examples.ProducerConsumer;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

//Один Producer, один Consumer

public class ProducerConsumerExample4 {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    //Разрешение проблемы используя семафоры

    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 3;
        int fillCount = 0;
        int value = 0;
        Semaphore emptyCount = new Semaphore(capacity);

        public void produce() throws InterruptedException {

            while (true) {
                System.out.println("Producer produced-" + value);
                emptyCount.acquire();
                list.add(value++);
                fillCount++;
                Thread.sleep(1000);

            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                Thread.sleep(1000);
                fillCount--;
                int val = list.removeFirst();
                emptyCount.release();
                System.out.println("Consumer consumed-" + val);
                Thread.sleep(1000);
            }
        }
    }
}
