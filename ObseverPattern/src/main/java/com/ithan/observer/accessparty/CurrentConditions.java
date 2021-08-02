package com.ithan.observer.accessparty;

import com.ithan.observer.Observer;

/**
 * 显示当前天气情况
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity)
    {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("CurrentTemperature：" + temperature);
        System.out.println("CurrentPressure：" + pressure);
        System.out.println("CurrentHumidity：" + humidity);
    }


}
