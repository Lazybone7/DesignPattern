package com.ithan.observer;

import com.ithan.observer.accessparty.BaiduSite;
import com.ithan.observer.accessparty.CurrentConditions;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //注册观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        weatherData.setData(10f,11f,12f);
        System.out.println("============注销对象==========================");
        weatherData.removeObserver(currentConditions);
        weatherData.setData(10f,11.5f,12f);
    }
}
