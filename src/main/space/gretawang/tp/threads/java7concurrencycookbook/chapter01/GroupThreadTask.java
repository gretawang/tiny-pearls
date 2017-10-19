package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;
import java.util.Random;

public class GroupThreadTask implements Runnable {

    @Override
    public void run() {
        int result;
        Random random = new Random(new Date().getTime());
        while (true){
            result = (int) (random.nextDouble() * 100);
            System.out.printf("%s - %d\n", Thread.currentThread().getId(), result);
            if (Thread.currentThread().isInterrupted()) {
                System.out.printf("Thread %s is interrupted.", Thread.currentThread().getId());
                return;
            }
        }
    }
}
