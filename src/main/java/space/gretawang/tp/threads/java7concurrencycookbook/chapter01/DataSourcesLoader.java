package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DataSourcesLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning data source loading: %s\n", new Date());
        try{
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Source loading has been finished. %s \n", new Date());
    }
}
