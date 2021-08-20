public class Main {

    public static void main(String[] args) {
       
         Ticket y = new TouristTicket("45678322", "Bhubaneswar", "Derhadun",
                "DepartureDateTime", "ArrivalDateTIme",
                "10A", 67593959, true, null, null,
                "Mayfair hotel", new String[]{"khandagiri","puri"});
        Ticket z = new RegularTicket("98345970", "Cuttack",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "7t", 89627485, true, null, null, "lunch");
       
        printTicketDetails(y);
        printTicketDetails(z);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}