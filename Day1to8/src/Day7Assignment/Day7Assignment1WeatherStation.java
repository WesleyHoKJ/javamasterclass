package Day7Assignment;

import java.util.ArrayList;
import java.util.List;

public class Day7Assignment1WeatherStation  {
    private float temperature;
    private float humidity;
    private List<WeatherObserver> observers;

    public Day7Assignment1WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    public void addObserver(WeatherObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
