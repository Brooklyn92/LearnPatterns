package observer.example1.pt2;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Атмосферное давление: " + lastPressure);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure  = weatherData.getPressure();
        display();
    }
}
