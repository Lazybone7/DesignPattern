package com.ithan.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类；
 * 包含最新的天气情况；
 * 含有CurrentConditions对象
 * 当数据有更新时,调用CurrentConditions对象的update方法
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    //观察者集合
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    private void dataChange(){
        notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //将最新信息推送给接入方
        dataChange();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //遍历所有观察者并通知
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(getTemperature(),getPressure(),getHumidity());
        }
    }
}
