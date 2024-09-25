package factoryMethod.example9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void main(String[] args) {
        ItemGenerator itemGenerator =  new GoldGenerator();
        itemGenerator.openReward();

        ItemGenerator itemGenerator1 = new GemGenerator();
        itemGenerator1.openReward();
    }

}
