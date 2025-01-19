package strategy.example4;

public class Program {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        //Курьерска доставка
        deliveryService.setDeliveryStrategy(new CourierDelivery());
        System.out.println("Курьер: " + deliveryService.calculatorCost(10));

        //Почтовая доставка
        deliveryService.setDeliveryStrategy(new PostalDelivery());
        System.out.println("Почта: " + deliveryService.calculatorCost(10));

        // Экспресс-доставка

        deliveryService.setDeliveryStrategy(new ExpressDelivery());
        System.out.println("Экспресс: " + deliveryService.calculatorCost(10));
    }
}
