package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

/**
 * https://www.javaworld.com/article/2074481/java-concurrency/java-101--understanding-java-threads--part-4---thread-groups--volatility--and-threa.html
 */
public class ThreadGroupDemo {
    public static void main(String args[]) {
        ThreadGroup tg = new ThreadGroup("subgroup1");
        Thread t1 = new Thread(tg, "thread1");
        Thread t2 = new Thread(tg, "thread2");
        Thread t3 = new Thread(tg, "thread3");

        tg = new ThreadGroup("subgroup2");

        Thread t4 = new Thread(tg, "mythread");

        tg=Thread.currentThread().getThreadGroup();
        int agc = tg.activeCount();

        System.out.printf("Active threads in thread group %s. Thread group: %d. \n", tg, agc);
        tg.list();
    }
}
