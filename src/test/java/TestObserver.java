import observer.custom.CurrentConditionsDisplay;
import observer.custom.WeatherData;

/**
 * Created by lx on 16/5/5.
 */
public class TestObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMessurements(80,65,30.4f);
        weatherData.setMessurements(90,78,37.4f);

    }
}
