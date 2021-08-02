package com.ithan.template01;

/**
 * 该方案存在的问题：
 *      第三方接入获取数据的问题
 *      无法在运行时动态添加第三方
 *      违反开闭原则(OCP原则)
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30F,150F,40F);
    }
}
