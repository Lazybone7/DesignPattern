package com.ithan.template01;

/**
 * 核心类；
 * 包含最新的天气情况；
 * 含有CurrentConditions对象
 * 当数据有更新时,调用CurrentConditions对象的update方法
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
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
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //将最新信息推送给接入方
        dataChange();
    }

}
