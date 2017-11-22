package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}
