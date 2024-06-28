package DZ.group01.CollectionMap.Dz1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> userLen=new HashMap<>();
        userLen.put("Сергей ",5);
        userLen.put("Михаил ",1);
        userLen.put("Николай ",3);
        userLen.put("Роман ",2);
        userLen.put("Петр ",4);
        userLen.put("Олег ",5);

        Set<Map.Entry <String,Integer>> setUser=userLen.entrySet();
        for (Map.Entry<String,Integer> o: setUser){
            System.out.println(o);
        }
        System.out.println("---------------print 4 or 5--------------------");
        for (Map.Entry<String,Integer> o: setUser){
            if(o.getValue()>=4 && o.getValue()<=5) {
                System.out.println(o);
            }
        }
    }
}
