package main.space.gretawang.tp.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Task extends RecursiveAction{
    @Override
    protected void compute() {
        System.out.println("Inside compute method.");
    }
}
public class ForkJoinPoolDemo {
    public static void main(String args[]) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new Task());
        pool.invoke(new Task());
        pool.invoke(new Task());
        System.out.println(pool.getActiveThreadCount());
    }
}
