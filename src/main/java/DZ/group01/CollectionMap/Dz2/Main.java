package DZ.group01.CollectionMap.Dz2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Map<String,Order> city =new HashMap<>();
        Set<Map.Entry<String,Order>> citySet=city.entrySet();
        Order order=new Order(100.00);
        order.getOrder().add("Мороженое");
        order.getOrder().add("Пирожноеф");
        city.put("Брянск",order);

        Order order1=new Order(300.00);
        city.put("Москва",order1);
        Order order2=new Order(6100.00);
        city.put("Иваново",order2);

        citySet.add();
        for (Map.Entry<String,Order> o: citySet) {
            System.out.println(o.getKey()+" " + o.getValue().sumOrder);
        }

    }


}
