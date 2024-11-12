package builder.example1;

public class Program {
    public static void main(String[] args) {
        PriceBuilder priceBuilder = new PriceBuilder();
        HouseBuilder houseBuilder = new HouseBuilder();
        DocBuilder docBuilder = new DocBuilder();

        Director salesman = new Director(priceBuilder); // продавец
        Director manager = new Director(docBuilder); // менеджер
        Director foreman = new Director(houseBuilder); // прораб

        salesman.make(true);
        int price = priceBuilder.getResult();
        System.out.println("Результат работы продавца " + price);

        foreman.make(true);
        House house = houseBuilder.getResult();
        System.out.println("Результат работы прораба " + house);

        manager.make(true);
        Documentation documentation = docBuilder.getResult();
        System.out.println("Результат работы менеджера " + documentation);
    }
}
