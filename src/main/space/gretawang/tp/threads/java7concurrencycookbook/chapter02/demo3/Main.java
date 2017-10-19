package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo3;

public class Main {
    public static void main(String args[]) {
        EventStorage eventStorage = new EventStorage();
        Producer producer = new Producer(eventStorage);
        Consumer consumer = new Consumer(eventStorage);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread2.start();

        thread1.start();
    }
}
