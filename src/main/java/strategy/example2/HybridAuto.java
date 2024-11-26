package strategy.example2;

public class HybridAuto extends Auto {

    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}
