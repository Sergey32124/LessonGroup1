package DZ.group01.CollectionSet.Dz1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Принимать со сканера числа (10 чисел) и добавлять в set коллекцию
(в той же последовательности что и были добавлены) после вывести */
public class Main {
    public static void main(String[] args) {
        Set<Double> set=new HashSet<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите 1 число");
        Double a=scanner.nextDouble();
        set.add(a);
        System.out.println("Введите 2 число");
        Double b= scanner.nextDouble();
        set.add(b);
        System.out.println("Введите 3 число");
        Double c= scanner.nextDouble();
        set.add(c);
        System.out.println("Введите 4 число");
        Double d= scanner.nextDouble();
        set.add(d);
        System.out.println("Введите 5 число");
        Double e= scanner.nextDouble();
        set.add(e);
        System.out.println("Введите 6 число");
                Double f= scanner.nextDouble();
        set.add(f);
        System.out.println("Введите 7 число");
        Double g= scanner.nextDouble();
        set.add(g);
        System.out.println("Введите 8 число");
        Double h= scanner.nextDouble();
        set.add(h);
        System.out.println("Введите 9 число");
        Double i= scanner.nextDouble();
        set.add(i);
        System.out.println("Введите 10 число");
        Double j= scanner.nextDouble();
        set.add(j);
        System.out.println(set);
    }
}
