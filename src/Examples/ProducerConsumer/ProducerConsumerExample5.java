package Examples.ProducerConsumer;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;

//Один Producer, множество Consumer

public class ProducerConsumerExample5 {
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

        Thread t3 = new Thread(new Runnable() {
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
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }

    //Разрешение проблемы используя семафор и мьютекс

    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 3;
        int fillCount = 0;
        int value = 0;
        Semaphore buffer_mutex = new Semaphore(1);
        Semaphore emptyCount = new Semaphore(capacity);

        public void produce() throws InterruptedException {

            while (true) {
                System.out.println("Producer produced-" + value);
                emptyCount.acquire();
                buffer_mutex.acquire();
                list.add(value++);
                buffer_mutex.release();
                fillCount++;
                Thread.sleep(1000);

            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                Thread.sleep(1000);
                fillCount--;
                buffer_mutex.acquire();
                int val = list.removeFirst();
                buffer_mutex.release();
                emptyCount.release();
                System.out.println("Consumer consumed-" + val);
                Thread.sleep(1000);
            }
        }
    }
}
