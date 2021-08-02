package com.ithan.observer.accessparty;

import com.ithan.observer.Observer;

public class BaiduSite implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display()
    {
        System.out.println("BaiduSiteTemperature：" + temperature);
        System.out.println("BaiduSitePressure：" + pressure);
        System.out.println("BaiduSiteHumidity：" + humidity);
    }
}
