public class Ticket {
    String EventName;
    String Seller;
    int numTickets;
    double price;

    public Ticket(String TheEventName, String TheSeller, int TheNumTickets, double Theprice) {

        EventName = TheEventName;
        Seller = TheSeller;
        numTickets = TheNumTickets;
        price = Theprice;

    };
}
