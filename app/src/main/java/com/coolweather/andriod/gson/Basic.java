package com.coolweather.andriod.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by houti on 2018/3/11.
 * 由于JSONHong中的一些字段可能不太适合直接作为Java字段来命名，因此这里使用了 @SerializedName注解的方式让JSON字段和Java字段之间建立映射关系。
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
