package strategy.example2;

public class StandartFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Просто заправляем бензин!");
    }
}
