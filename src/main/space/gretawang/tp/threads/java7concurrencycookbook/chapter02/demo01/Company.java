package main.space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo01;

public class Company implements Runnable{
    private Account account;

    public Company(Account account) {
        this.account = account;
    }
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            account.addAmount(100);
        }
    }
}
