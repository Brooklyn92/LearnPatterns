package observer.example1;

public class CurrentConditionsDisplay extends WeatherData implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    public Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();

    }

    @Override
    public void display() {
        System.out.println("Текущие значения: " + temperature + " °C и влажность воздуха " + humidity + "%");
    }
}
