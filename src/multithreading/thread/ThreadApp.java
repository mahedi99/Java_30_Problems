package multithreading.thread;


class Runner extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadApp {
    public static void main(String a[]){
        Runner runner1 = new Runner();
        runner1.start(); //Calling start() will create a new thread else calling run() will now create any new thread rather will be running in main thread

        Runner runner2 = new Runner();
        runner2.start();
    }
}
