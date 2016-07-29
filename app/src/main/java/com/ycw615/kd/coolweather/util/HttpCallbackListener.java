package com.ycw615.kd.coolweather.util;

/**
 * Created by yaochengwei on 2016/7/29.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
