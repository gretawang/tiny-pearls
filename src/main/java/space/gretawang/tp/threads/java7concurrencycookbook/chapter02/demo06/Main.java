package space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo06;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String args[]) {
        final ReentrantLock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();

        new Thread(() -> {
            lock.lock();
            System.out.printf("%s got the lock.\n", Thread.currentThread().getName());
            System.out.printf("%s waits for signal.\n", Thread.currentThread().getName());
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("%s got the signal.\n", Thread.currentThread().getName());
            lock.unlock();
        }, "Thread 1").start();

        new Thread(()->{
            lock.lock();
            System.out.printf("%s got the lock.\n", Thread.currentThread().getName());
            try{
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.printf("%s sent signal. \n", Thread.currentThread().getName());
            condition.signalAll();
            lock.unlock();


        }, "Thread 2").start();
    }
}
