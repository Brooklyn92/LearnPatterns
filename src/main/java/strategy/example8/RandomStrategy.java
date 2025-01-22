package strategy.example8;

import java.util.Random;

public class RandomStrategy implements Strategy {
    Random random = new Random();
    @Override
    public int getResult(int[] data) {
        if (data.length == 0) return 0;
        return data[random.nextInt(data.length)];
    }
}
