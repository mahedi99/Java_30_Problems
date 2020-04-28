package multithreading.advance;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author Mahedi Hassan
 * 2020-04-28
 */

public class LowLevelProducerConsumer {

    private LinkedList<Integer> list = new LinkedList<>();
    private final int LIMIT = 10000;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true){
            synchronized (lock) {
                if (list.size() == LIMIT){
                    lock.wait();
                }
                list.add(value++);
                lock.notify();
            }
        }
    }
    public void consume() throws InterruptedException {
        while (true){
            synchronized (lock) {
                if (list.size() == 0) {
                    lock.wait();
                }
                System.out.print("List size is : " + list.size() + "\t");
                int value = list.removeFirst();
                System.out.println("Value is : " + value);
                lock.notify();
            }
            Thread.sleep(new Random().nextInt(1000));
        }
    }



    public static void main(String a[]) throws InterruptedException {
        LowLevelProducerConsumer lowLevelProducerConsumer = new LowLevelProducerConsumer();
        Thread t1 = new Thread(() -> {
            try {
                lowLevelProducerConsumer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                lowLevelProducerConsumer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start();
        t1.start();


        t2.join();
        t1.join();
    }
}
