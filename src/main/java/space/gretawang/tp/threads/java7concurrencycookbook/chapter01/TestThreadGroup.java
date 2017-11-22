package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

public class TestThreadGroup extends ThreadGroup {
    public TestThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e){
        System.out.printf("Thread %s has thrown an exception.\n", t.getId());
        e.printStackTrace(System.out);
        System.out.println("Terminated all other threads.");
        interrupt();
    }
}
