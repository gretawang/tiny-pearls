package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.concurrent.TimeUnit;

public class SearchTaskMain {
    public static void main(String args[]) {
        ThreadGroup group = new ThreadGroup("searchTask");
        Result result = new Result();
        SearchTask searchTask = new SearchTask(result);

        for(int i=0; i<5; i++) {
            Thread thread = new Thread(group, searchTask);
            thread.start();
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Number threads: %d.\n", group.activeCount());
        System.out.println("Information about thread group:");
        group.list();

        Thread[] threads = new Thread[group.activeCount()];
        group.enumerate(threads);
        for(int i=0; i<group.activeCount(); i++) {
            System.out.printf("Thread %s: %s.\n", threads[i].getName(), threads[i].getState());
        }
        waitFinish(group);
        group.interrupt();
    }

    private static void waitFinish(ThreadGroup group) {
        while (group.activeCount() > 4) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
