package observer.example1.pt2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    public WeatherData weatherData;


    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();

    }

    @Override
    public void display() {
        System.out.println("Текущие значения: " + temperature + " °C и влажность воздуха " + humidity + "%");
    }
}
