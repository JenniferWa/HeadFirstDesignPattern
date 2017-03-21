/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2observer.v2;

import c2observer.v1.DisplayElement;
import java.util.Observable;
import java.util.Observer;

/**
 *
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }
    
    

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherdata = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure =weatherdata.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast: lastPressure is" + lastPressure 
                + " current pressure is " + currentPressure);
    }
    
}
