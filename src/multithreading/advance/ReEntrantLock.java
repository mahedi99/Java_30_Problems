package multithreading.advance;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mahedi Hassan
 * 2020-04-30
 */

public class ReEntrantLock {
    public static void main(String a[]) throws InterruptedException {

        Runner runner = new Runner();

        Thread t1 = new Thread(() -> {
            try {
                runner.firstThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                runner.secondThread();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        runner.finished();
    }
}

class Runner{
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    private void incrementCount(){
        for (int i = 0; i < 10000; i++){
            count++;
        }
    }
    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("first Thread awaiting...");
        condition.await();
        try {
            System.out.println("Incremented in first thread");
            incrementCount();
        } finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();
        System.out.println("Press Enter key");
        new Scanner(System.in).nextLine();

        condition.signal();

        try {
            Thread.sleep(2000);
            System.out.println("Incremented in second thread");
            incrementCount();
        } finally {
            lock.unlock();
        }

//        System.out.println("Second thread finished");
    }

    public void finished(){
        System.out.println("Count : " + count);
    }
}
