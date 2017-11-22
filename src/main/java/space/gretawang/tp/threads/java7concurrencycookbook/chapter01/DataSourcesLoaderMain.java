package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;

public class DataSourcesLoaderMain {
    public static void main(String args[]) {
        DataSourcesLoader dataSourcesLoader = new DataSourcesLoader();
        Thread thread1 = new Thread(dataSourcesLoader);

        NetworkConnectionsLoader networkConnectionsLoader = new NetworkConnectionsLoader();
        Thread thread2 = new Thread(networkConnectionsLoader);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: configuration has been finished: %s", new Date());
    }
}
