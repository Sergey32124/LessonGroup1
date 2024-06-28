package DZ.group01.CollectionMap.Dz2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
//
//        Order order=new Order(100.00);
//        order.getOrder().add("Мороженое");
//        order.getOrder().add("Пирожноеф");
//        city.put("Брянск",order);
//
//        Order order1=new Order(300.00);
//        city.put("Москва",order1);
//        Order order2=new Order(6100.00);
//        city.put("Иваново",order2);
//
//        citySet.add();
//        for (Map.Entry<String,Order> o: citySet) {
//            System.out.println(o.getKey()+" " + o.getValue().sumOrder);
//        }
        Map<String, Order> city = new HashMap<>();//

        city.put("Москва", new Order(100.00, Arrays.asList("Мороженое", "Батон")));
        city.put("Минск", new Order(200.00, Arrays.asList("Пироженое", "Батон")));
        city.put("Иваново", new Order(400.00, Arrays.asList("Сок", "Шоколад")));
        Set<Map.Entry<String, Order>> citySet = city.entrySet();//создаем сет для работы
        for (Map.Entry<String, Order> stringOrder : citySet) {
            if (stringOrder.getKey().equals("Иваново")) {
                System.out.println(stringOrder.getValue().sumOrder + " " + stringOrder.getValue().order);
            }
        }
    }
}

