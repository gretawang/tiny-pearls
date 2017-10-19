package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

public class ExceptionMain {
    public static void main(String args[]) {
        Thread thread = new Thread(new Task());
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }
}
