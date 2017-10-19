package main.space.gretawang.tp.threads2.chapter02.demo01;

public class Main {
    public static void main(String args[]) {
        Account account = new Account();
        account.setBalance(1000);
        System.out.printf("Account initial balance: %f\n", account.getBalance());
        Thread bankThread = new Thread(new Bank(account));
        Thread companyThread = new Thread(new Company(account));

        bankThread.start();
        companyThread.start();

        try{
            bankThread.join();
            companyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Account final balance: %f\n", account.getBalance());
    }
}
