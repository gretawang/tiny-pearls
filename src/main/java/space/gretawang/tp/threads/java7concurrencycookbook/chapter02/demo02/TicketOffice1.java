package space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo02;

public class TicketOffice1 implements Runnable {
    private Cinema cinema;

    public TicketOffice1(Cinema cinema) {
        this.cinema = cinema;
    }
    @Override
    public void run() {
        cinema.sellTicket1(10);
        cinema.sellTicket1(5);
        cinema.returnTicket1(5);
        cinema.sellTicket1(2);
        cinema.sellTicket1(4);
        cinema.sellTicket1(4);
    }
}
