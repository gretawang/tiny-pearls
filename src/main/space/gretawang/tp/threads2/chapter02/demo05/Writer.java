package main.space.gretawang.tp.threads2.chapter02.demo05;

public class Writer implements Runnable {
    private PricesInfo pricesInfo;

    public Writer(PricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    @Override
    public void run() {
        for(int i=0; i<3; i++) {
            System.out.println("Writer: Attempt to modify the process.");
            pricesInfo.setPrices(Math.random()*8, Math.random()*10);
            System.out.println("Writer: Prices have been modified.");
            try{
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
