package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning network connection loader: %s\n", new Date());
        try{
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Network connection loader has been finished: %s\n", new Date());
    }
}
