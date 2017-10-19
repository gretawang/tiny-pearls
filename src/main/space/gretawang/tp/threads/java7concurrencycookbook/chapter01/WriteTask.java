package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class WriteTask implements Runnable {

    private Deque<Event> deque;

    public WriteTask(Deque<Event> deque) {
        this.deque = deque;
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            Event event = new Event();
            event.setDate(new Date());
            String message = String.format("The thread %s has been generated an event", Thread.currentThread().getName());
            event.setType(message);
            deque.addFirst(event);
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
