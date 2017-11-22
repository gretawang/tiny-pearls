package space.gretawang.tp.threads.concurrencyutilities;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    protected BlockingQueue blockingQueue = null;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            blockingQueue.put("1");
            Thread.sleep(1000);
            blockingQueue.put("2");
            Thread.sleep(1000);

            blockingQueue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
