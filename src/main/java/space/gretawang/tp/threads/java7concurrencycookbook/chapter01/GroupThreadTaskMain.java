package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

public class GroupThreadTaskMain {
    public static void main(String args[]) {
        TestThreadGroup group = new TestThreadGroup("testthreadgroup");
        Task task = new Task();

        for(int i=0; i<2; i++) {
            Thread t = new Thread(group, task);
            t.start();
        }

    }
}
