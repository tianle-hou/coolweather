package com.coolweather.andriod.gson;

/**
 * Created by houti on 2018/3/11.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
