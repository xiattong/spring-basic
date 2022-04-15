package com.xiattong.pattern.creational.singleton.register;

/**
 * 注册式-枚举式单例模式
 * Created by Tom.
 */
public enum EnumSingleton {
    INSTANCE,
    INSTANCE_B;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}
