package multithreading.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mahedi Hassan
 * 2020-04-22
 */

public class WorkerApp {

    Object lock1 = new Object();
    Object lock2 = new Object();

    private Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void stageOne(){
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void stageTwo(){
        synchronized (lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void processor(){
        for (int i = 0; i < 1000; i++){
            stageOne();
            stageTwo();
        }
    }

    public void execute(){
        System.out.println("Starting...");

        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(() -> processor());
        thread1.start();
        Thread thread2 = new Thread(() -> processor());
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken : " + (end - start));
        System.out.println("List1 : " + list1.size() + ", List2 : " + list2.size());
    }

    public static void main(String s[]){
        WorkerApp workerApp = new WorkerApp();
        workerApp.execute();
    }
}
