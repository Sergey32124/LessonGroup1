package DZ.group01.ShopTicket.Ticket;
/*Создайте класс Ticket
        Свойства
        Расстояние в км(тип long)
        Стоимость
        Конструктор пустой
        Гетеры и сеттеры

        Создайте класс TicketServise
        Метод createTicket
        Принимает километры
        И возвращает билет
        Где стоимость будет расчитана по формуле

        1 км = 3 руб

        Метод createTicketWithDiscount
        Принимает километры
        И возвращает билет

        Со стоимостью
        1 км  = 3 руб

        Но если км будет больше 1000 то
        1 км = 2 руб

        Если км будет больше 2000
        1км = 1 руб

        Написать тесты к TicketService.*/
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
