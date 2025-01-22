package strategy.example8;

public class Context {
    private Strategy strategy;
    private final int[] data;

    public Context(int... data) {
        this.data = data;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        System.out.println(this.strategy.getResult(data));
    }
}
