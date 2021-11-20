interface TicketBooking {

    public void bookTicket();
}

class TicketBookingAgent implements TicketBooking{

    TicketBooking t ;
    TicketBookingAgent(TicketBooking t){
        this.t = t;
    }
    @Override
    public void bookTicket() {
         
        t.bookTicket();
    }

    
}
class TrainTicketBooking implements TicketBooking{

    @Override
    public void bookTicket() {
        
        System.out.println("Train ticket booked");
    }
    
}
class FlightTicketBooking implements TicketBooking{

    @Override
    public void bookTicket() {
        
        System.out.println("Flight ticket booked");
    }
    
}
 public class Deligation{

    public static void main(String[] args) {
        
        TicketBookingAgent t = new TicketBookingAgent(new TrainTicketBooking());
        t.bookTicket();
        TicketBookingAgent t1 = new TicketBookingAgent(new FlightTicketBooking());
        t1.bookTicket();
    }
 }