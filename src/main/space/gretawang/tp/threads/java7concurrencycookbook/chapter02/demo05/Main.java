package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo05;

public class Main {
    public static void main(String args[]) {
        PricesInfo pricesInfo = new PricesInfo();
        Reader reader[] = new Reader[5];
        Thread[] readerThreads = new Thread[5];
        for(int i=0; i<5; i++) {
            reader[i] = new Reader(pricesInfo);
            readerThreads[i] = new Thread(reader[i]);
        }

        Writer writer = new Writer(pricesInfo);

        Thread writerThread = new Thread(writer);

        for(int i=0; i<5; i++) {
            readerThreads[i].start();
        }

        writerThread.start();
    }
}
