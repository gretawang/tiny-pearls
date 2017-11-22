package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.concurrent.TimeUnit;

public class PrimeGeneratorMain {
    public static void main(String args[]) {
        Thread thread = new PrimeGenerator();
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
