# Java Event Publishing System

## Implement an event publishing system in Java using the Observer pattern.

The Observer pattern defines a one-to-many relationship between objects. When the state of an object changes, all the objects that depend on it are notified and updated automatically. In the context of event publishing, the event publisher is the "observable" and the event subscribers are the "observers".

Let's say we have a WeatherStation class that measures the temperature and humidity and publishes updates to its subscribers. We can define the WeatherStation class as follows:


    import java.util.ArrayList;
    import java.util.List;

    public class WeatherStation {
        private float temperature;
        private float humidity;
        private List<WeatherObserver> observers;

        public WeatherStation() {
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

The **WeatherStation** class maintains a list of WeatherObserver objects that are interested in receiving updates. The setMeasurements() method is called whenever new temperature and humidity data is available, and it notifies all the observers by calling the update() method on each one.

Next, we need to define the WeatherObserver interface that defines the update() method that will be called by the WeatherStation:

    public interface WeatherObserver {
        void update(float temperature, float humidity);
    }

Finally, we can define a concrete WeatherDisplay class that implements the WeatherObserver interface and displays the temperature and humidity:

    public class WeatherDisplay implements WeatherObserver {
        public void update(float temperature, float humidity) {
            System.out.println("Temperature: " + temperature + "C, Humidity: " + humidity + "%");
        }
    }

To use the event publishing system, we can create a WeatherStation object, create a WeatherDisplay object, and register the display as an observer of the station:

    WeatherStation station = new WeatherStation();
    WeatherDisplay display = new WeatherDisplay();
    station.addObserver(display);

Now, whenever the weather station receives new temperature and humidity data, it will automatically notify the display object, which will update the display with the new data.

    station.setMeasurements(25.0f, 70.0f); // prints "Temperature: 25.0C, Humidity: 70.0%"
    
This is a simple example of how to implement an event publishing system in Java using the Observer pattern. The same pattern can be used in more complex systems where multiple objects need to be notified of changes in the state of an object.