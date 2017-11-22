package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.ArrayDeque;
import java.util.Deque;

public class WorkTaskMain {
    public static void main(String args[]) {
        Deque<Event> deque = new ArrayDeque<>();
        WriteTask writeTask = new WriteTask(deque);
        for(int i=0; i<3; i++) {
            Thread thread = new Thread(writeTask);
            thread.start();
        }
        CleanTask cleanTask = new CleanTask(deque);
        cleanTask.start();

    }
}
