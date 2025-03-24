package chapter2.weather;

import chapter2.weather.display.impl.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay display1 = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f); // request
    }
}
