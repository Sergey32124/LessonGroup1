package DZ.group01.ShopTicket.Ticket;

public class TicketServise {
    public Ticket createTicket(long kilometers){
    Ticket ticket=new Ticket();
    ticket.setDistance_in_km(kilometers);
    ticket.setPrice(kilometers*3);
    return ticket;
    }
    public Ticket createTicketWithDiscount(double kilometers){
        Ticket ticket= new Ticket();
        if (kilometers>2000){
            ticket.setPrice(kilometers*1);
        }else if(kilometers >= 1000){
            ticket.setPrice(kilometers*2);
        }else {
            ticket.setPrice(kilometers*3);
        }
        return ticket;
    }
}
