package DZ.group01.CollectionMap.Dz2;

import DZ.group01.CollectionSet.Dz2.Auto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    Double sumOrder;
    List<String> order;

    public Order(Double sumOrder,List<String>order){
        this.sumOrder=sumOrder;
        this.order = order;
    }


}
