package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.concurrent.TimeUnit;

public class SafeTaskMain {
    public static void main(String args[]) {
        SafeTask safeTask = new SafeTask();

        for(int i=0; i<10; i++) {
            Thread thread = new Thread(safeTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
