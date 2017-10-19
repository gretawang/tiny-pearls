package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo3;

public class Producer implements Runnable {
    private EventStorage eventStorage;

    public Producer(EventStorage eventStorage) {
        this.eventStorage = eventStorage;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            eventStorage.set();
        }
    }
}
