package DZ.group01.CollectionMap.Dz3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> maps=new LinkedHashMap<>();

        maps.put("dd",1);
        maps.put("aa",2);
        maps.put("cc",3);
        for(Map.Entry<String,Integer> entry : maps.entrySet()){
            System.out.println(entry);
        }
    }
}
