/*
 This class represents a Movie Ticket booking system.
 It stores and displays ticket details.
*/
class MovieTicket {

    private String movieName; // movie name
    private int seatNumber; // seat number
    private double price; // ticket price

    void bookTicket(String movie, int seat, double price) { // books ticket
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = price;
    }

    void displayTicket() { // displays ticket details
        System.out.println(movieName + " Seat: " + seatNumber + " Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(); // creating ticket object
        ticket.bookTicket("Inception", 15, 250); // booking ticket
        ticket.displayTicket(); // displaying details
    }
}
