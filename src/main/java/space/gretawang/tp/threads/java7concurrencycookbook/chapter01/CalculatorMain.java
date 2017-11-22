package space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorMain {
    public static void main(String args[]) {
        Thread[] threads = new Thread[10];
        Thread.State[] threadStates = new Thread.State[10];


        for(int i=0; i<10; i++) {
            Calculator calculator = new Calculator(i);
            threads[i] = new Thread(calculator);
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            }else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread " + i);
        }

        try(FileWriter file = new FileWriter("d:\\data\\log.txt");
            PrintWriter printWriter = new PrintWriter(file)) {
            for(int i=0; i<10; i++) {
                printWriter.println("Main: Status of thread " + i +" : " + threads[i].getState());
                threadStates[i] = threads[i].getState();
            }

            for(int i=0; i<10; i++) {
                threads[i].start();
            }

            boolean finished = false;

            while (!finished) {
                for(int i=0; i<10; i++) {
                    if (threads[i].getState() != threadStates[i]) {
                        writeThreadInfo(printWriter, threads[i], threadStates[i]);
                        threadStates[i] = threads[i].getState();
                    }
                }
                finished = true;
                for(int i=0; i<10;i++) {
                    finished = finished && (threads[i].getState() == Thread.State.TERMINATED);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void writeThreadInfo(PrintWriter pw, Thread thread, Thread.State state) {
        pw.printf("Main : Id %d - %s\n", thread.getId(), thread.getName());
        pw.printf("Main : Priority: %d\n", thread.getPriority());
        pw.printf("Main : Old State: %s\n", state);
        pw.printf("Main : New State: %s\n", thread.getState());
        pw.println("******************************************");
    }
}
