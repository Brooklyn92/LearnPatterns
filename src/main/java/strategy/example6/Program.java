package strategy.example6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murka"));
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Zebra"));
        System.out.println(cats); // => [Cat{name='Murka'}, Cat{name='Barsik'}, Cat{name='Zebra'}]

        Collections.sort(cats, new Comparator<Cat>() {  // => реализация стратегии интерфейса Comparator в java
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(cats); // => [Cat{name='Barsik'}, Cat{name='Murka'}, Cat{name='Zebra'}]
    }
}
