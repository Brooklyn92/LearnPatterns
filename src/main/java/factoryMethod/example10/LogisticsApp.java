package factoryMethod.example10;

public class LogisticsApp {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistic();
        Transport transport = logistics.createTransport();
        System.out.println(transport.getClass());
    }
}
