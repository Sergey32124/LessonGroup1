package DZ.group01.ShopTicket.Ticket;

public class TicketServise {
    public Ticket createTicket(long kilometrs){
    Ticket ticket=new Ticket();
    ticket.setDistance_in_km(kilometrs);
    ticket.setPrice(kilometrs*3);
    return ticket;
    }
    public Ticket createTicketWithDiscount(double kilometrs){
        Ticket ticket= new Ticket();
        if (kilometrs>=1000){
            ticket.setPrice(kilometrs*1);
        }else if(kilometrs>=2000){
            ticket.setPrice(kilometrs*2);
        }else {
            ticket.setPrice(kilometrs*3);
        }
        return ticket;
    }
}
