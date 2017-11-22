package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("An exception has been captured.\n");
        System.out.printf("The thread: %s\n", t.getId());

        System.out.printf("Exception is: %s - %s\n", e.getClass().getName(), e.getMessage());
        System.out.println("Stack trace:");
        e.printStackTrace();

        System.out.printf("Thread status: %s\n", t.getState());
    }
}
