package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.Date;
import java.util.Deque;

public class CleanTask extends Thread {
    private Deque<Event> deque;

    public CleanTask(Deque<Event> deque) {
        this.deque = deque;
        setDaemon(true);
    }

    @Override
    public void run() {
        Date date = new Date();
        clean(date);
    }

    private void clean(Date date) {
        if (deque.size() == 0) {
            return;
        }
        long difference;
        boolean deleted = false;
        do{
            Event e = deque.getLast();
            difference = date.getTime() - e.getDate().getTime();
            if (difference > 1000) {
                System.out.printf("Clean: %s\n", e.getType());
                deque.removeLast();
            }
        }while (difference>1000);

        if (deleted) {
            System.out.printf("Cleaner: size of deque: %d\n", deque.size());
        }
    }
}
