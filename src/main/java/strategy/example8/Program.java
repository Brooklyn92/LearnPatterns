package strategy.example8;

public class Program {
    public static void main(String[] args) {
        Context context = new Context(10, 20, 5, 30, 17, 47, 28, 36);

        context.setStrategy(new MinStrategy());
        context.execute();

        context.setStrategy(new MaxStrategy());
        context.execute();

        context.setStrategy(new RandomStrategy());
        context.execute();

    }
}
