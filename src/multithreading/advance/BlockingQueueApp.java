package multithreading.advance;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Mahedi Hassan
 * 2020-04-24
 */

public class BlockingQueueApp {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String ap[]) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                producer();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
    private static void producer(){
        Random random = new Random();
        while (true){
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer(){
        Random random = new Random();
        while (true){
            try {
                Thread.sleep(100);
                if (random.nextInt(3) == 0){
                    Integer value = queue.take();
                    System.out.println("Taken value: " + value + "; Queue size is : " + queue.size());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
