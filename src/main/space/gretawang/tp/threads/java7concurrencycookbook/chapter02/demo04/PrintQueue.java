package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo04;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {
    private final Lock lock = new ReentrantLock();


    public void printJob(Object document) {
        lock.lock();
        try{
            int duration = (int)(Math.random()*10);
            System.out.printf("%s: Print Queue: Printing a Job during %d.\n",
                    Thread.currentThread().getName(), duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
