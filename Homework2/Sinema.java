public class Sinema {
    private String Genre;
    private double TicketPrice = 100;


    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }


    public void buyticket(int age, String genre) {

        if (age < 18) {
            TicketPrice = TicketPrice - TicketPrice * 10 / 100;

        }
        if (age >= 18 && age < 25) {
            TicketPrice = TicketPrice - TicketPrice * 5 / 100;

        }
        if (genre.equals("Korku")) {
            TicketPrice = TicketPrice - TicketPrice * 10 / 100;

        }
        System.out.println("Ticket Price:"+TicketPrice);

    }
}
