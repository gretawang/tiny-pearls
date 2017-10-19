package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter01;

public class PrimeGenerator extends Thread {
    @Override
    public void run() {
        long number = 1L;
        while (true) {
            if (isPrime(number)) {
                System.out.printf("Number %d is a prime.\n", number);
            }

            if (isInterrupted()) {
                System.out.println("The prime generator is terminated.");
                return;
            }
            number++;
        }

    }

    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }

        for(long i=2; i<number/2+1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
