package space.gretawang.tp.threads.java7concurrencycookbook.chapter02.demo02;

public class Main {
    public static void main(String args[]) {
        Cinema cinema = new Cinema();
        TicketOffice1 ticketOffice1 = new TicketOffice1(cinema);
        Thread thread1 = new Thread(ticketOffice1, "t1");

        TicketOffice2 ticketOffice2 = new TicketOffice2(cinema);
        Thread thread2 = new Thread(ticketOffice2, "t2");

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Room 1 vacancies: %d. \n", cinema.getVacanciesCinema1());
        System.out.printf("Room 2 vacancies: %d. \n", cinema.getVacanciesCinema2());
    }
}
