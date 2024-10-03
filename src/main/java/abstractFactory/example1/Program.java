package abstractFactory.example1;

import abstractFactory.example1.factories.HouseFactory;
import abstractFactory.example1.factories.StoneHouseFactory;
import abstractFactory.example1.factories.WoodHouseFactory;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        HouseFactory factory;
        if (Locale.getDefault().getCountry().equals("RU")) {
            factory = new StoneHouseFactory();
        } else {
            factory = new WoodHouseFactory();
        }
        factory.createWall().build();
        factory.createRoof().cover().waterProtect();
        factory.createWindow().install().open();


    }
}
