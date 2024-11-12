package builder.example2;

public class Program {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .withDough("thin")
                .withSauce("marinara")
                .withTopping("pepperoni")
                .withTopping("mushroom")
                .build();
        System.out.println(pizza);
    }
}
