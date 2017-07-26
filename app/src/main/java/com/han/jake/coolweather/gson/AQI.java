package com.han.jake.coolweather.gson;

/**
 * Created by Jake on 2017/7/23.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
