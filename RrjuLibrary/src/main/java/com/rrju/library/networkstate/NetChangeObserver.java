package com.rrju.library.networkstate;

/**
 * 网络改变观察者，观察网络改变后回调的方法
 * Created by tanyan on 2018-07-23
 */
public interface NetChangeObserver {

    /**
     * 网络连接回调 type为网络类型
     */
     void onNetConnected(String type);

    /**
     * 没有网络
     */
     void onNetDisConnect();
}