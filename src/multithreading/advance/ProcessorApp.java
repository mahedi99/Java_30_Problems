package multithreading.advance;

import java.util.Scanner;

class Processor extends Thread{
    private boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        running = false;
    }
}

public class ProcessorApp {
    public static void main(String a[]){
        Processor processor1 = new Processor();
        processor1.start();

        System.out.println("Press enter to stop : ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        processor1.shutdown();
    }
}
