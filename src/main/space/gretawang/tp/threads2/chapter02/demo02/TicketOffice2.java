package main.space.gretawang.tp.threads2.chapter02.demo02;

public class TicketOffice2 implements Runnable {
    private Cinema cinema;

    public TicketOffice2(Cinema cinema) {
        this.cinema = cinema;
    }
    @Override
    public void run() {
        cinema.sellTicket2(2);
        cinema.sellTicket2(5);
        cinema.sellTicket2(4);
        cinema.returnTicket2(5);
        cinema.sellTicket2(2);
    }
}
