package builder.example2;

import java.util.List;

public class Pizza {
    private String dough;
    private String sauce;
    private List<String> toppings;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.toppings = pizzaBuilder.toppings;
    }
}
