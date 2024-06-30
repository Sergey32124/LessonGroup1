package DZ.group01.ShopTicket.Ticket;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ticket {
    private long Distance_in_km;
    private double price;

    public Ticket(){

    }
}
