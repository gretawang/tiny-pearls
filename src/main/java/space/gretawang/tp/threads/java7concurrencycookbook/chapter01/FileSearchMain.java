package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.concurrent.TimeUnit;

public class FileSearchMain {
    public static void main(String args[]) {
        Thread thread = new Thread(new FileSearch("c:\\", "README.txt"));
        thread.start();

        try{
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}
