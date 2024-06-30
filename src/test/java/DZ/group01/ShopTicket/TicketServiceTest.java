package DZ.group01.ShopTicket;

import DZ.group01.ShopTicket.Ticket.TicketServise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketServiceTest {
    @Test
    public void distantionTicket1(){
        TicketServise ticketServise=new TicketServise();
        Assertions.assertEquals(1200,400);
    }
    @Test
    public void distantionTicket2(){
        TicketServise ticketServise=new TicketServise();
        Assertions.assertEquals(2000,4000);
    }
}
