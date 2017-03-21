/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2observer.v2;



/**
 *
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay 
                = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);
    }
    
}
