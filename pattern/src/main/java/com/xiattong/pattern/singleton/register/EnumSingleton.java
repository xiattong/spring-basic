package com.xiattong.pattern.singleton.register;

/**
 * 注册式-枚举式单例模式
 * Created by Tom.
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){return INSTANCE;}
}
