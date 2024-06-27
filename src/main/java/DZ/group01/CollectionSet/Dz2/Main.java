package DZ.group01.CollectionSet.Dz2;

/*Задача 2
Создать класс Auto
        свойства
цвет
        цена
модель
        марка
год выпуска
название продавца

Создать 5-10 авто в маине  классе и добавить в HashSet
сделать так чтоб авто не добавлялись в коллекцию если их марка и модель и цена год выпуска и цвет
        совпадают*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Auto auto=new Auto("e",100.0,"L","KK",1997);
        Auto auto1=new Auto("e",100.0,"L","KK",1997);
        Auto auto2=new Auto("e",100.0,"L","KK",1997);

        Auto auto3=new Auto("e",100.0,"L","KK",1997);
        Auto auto4=new Auto("e",100.0,"L","KK",1997);
        Set<Auto> autoSet=new HashSet<>();
        autoSet.add(auto);
        autoSet.add(auto1);
        autoSet.add(auto2);
        autoSet.add(auto3);
        autoSet.add(auto4);
        for(Auto s:autoSet){
            System.out.println(s);
        }
    }

}
