package chapter2.weather.display;

public interface Observer {

    void update(float temp, float humidity, float pressure);
}
