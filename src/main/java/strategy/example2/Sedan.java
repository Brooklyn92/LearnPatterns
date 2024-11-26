package strategy.example2;

public class Sedan extends Auto {

    public Sedan() {
        this.fillStrategy = new StandartFillStrategy();
    }
}
