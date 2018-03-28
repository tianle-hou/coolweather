package com.coolweather.andriod.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by houti on 2018/3/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}