package multithreading.advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Mahedi Hassan
 * 2020-04-22
 */

class ThreadPool implements Runnable {
    private int id;
    public ThreadPool(int id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting : " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Completed : " + id);
    }
}

public class ThreadPoolApp {
    public static void main(String[] a){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++){
            executorService.submit(new ThreadPool(i));
        }
        executorService.shutdown();

        System.out.println("All tasks submitted.");

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks completed.");
    }
}
