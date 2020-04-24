package multithreading.processor;

/**
 * @author Mahedi Hassan
 * 2020-04-22
 */

//has issues
public class SynchronizationApp {

    private int count = 0;

    public static void main(String a[]){
        SynchronizationApp synchronizationApp = new SynchronizationApp();
        synchronizationApp.doWork();
    }

    public synchronized void increaseCount(){
        count++;
    }

    public void  doWork(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    increaseCount();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                    increaseCount();
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println("Count is : " + count);
    }
}
