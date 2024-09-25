package factoryMethod.example8;

public class Program {
    public static void main(String[] args) {
        Logistics truck = new RoadLogistics();
        System.out.println(truck.createTransport().getClass()); // => class factoryMethod.example8.Truck
        truck.createTransport().deliver(); // => Truck deliver
    }
}
