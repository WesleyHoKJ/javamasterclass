package Day7Assignment;

public class WeatherDisplay implements WeatherObserver{
    public void update(float temperature, float humidity) {
        System.out.println("Temperature: " + temperature + "C, Humidity: " + humidity + "%");
    }
}
