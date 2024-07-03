package DZ.group01.ShopTicket.Ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiseTest {
    TicketServise ticketServise = new TicketServise();

    @Test
    void createTicket() {
    Ticket t=ticketServise.createTicket(50);
    assertEquals(150,t.getPrice());
    }

    @Test
    void createTicketWithDiscountIfLess1000() {
        Ticket t=ticketServise.createTicketWithDiscount(500);
        assertEquals(1500,t.getPrice());
    }
    @Test
    void createTicketWithDiscountIfMore1000() {
        Ticket t=ticketServise.createTicketWithDiscount(1001);
        assertEquals(2002,t.getPrice());
    }
    @Test
    void createTicketWithDiscountIfMore2000() {
        Ticket t=ticketServise.createTicketWithDiscount(2050);
        assertEquals(2050,t.getPrice());
    }
}