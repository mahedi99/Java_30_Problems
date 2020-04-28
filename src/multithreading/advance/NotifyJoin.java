package multithreading.advance;

import java.util.Scanner;

/**
 * @author Mahedi Hassan
 * 2020-04-27
 */

public class NotifyJoin {
    public static void main(String a[]) throws InterruptedException{
        NotifyJoin notifyJoin = new NotifyJoin();

        Thread t1 =new Thread(() -> {
            try {
                notifyJoin.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 =new Thread(() -> {
            try {
                notifyJoin.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }

    public void produce() throws InterruptedException {
        synchronized (this){
            System.out.println("Produce starts");
            wait();
            System.out.println("Wait got called");
        }
    }
    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        synchronized (this){
            System.out.println("Consume starts");
            System.out.println("Waiting for Enter Key");
            scanner.nextLine();
            System.out.println("Notified");
            notify();
        }
    }
}
