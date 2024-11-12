package builder.example2;


import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public PizzaBuilder withDough(String dough) {
        System.out.println(dough);
        this.dough = dough;
        return this;
    }

    public PizzaBuilder withSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder withTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza(this);
    }
}
