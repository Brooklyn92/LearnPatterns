package factoryMethod.example5;


public class Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default: return null;
        }
    }
}
