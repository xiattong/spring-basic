package com.xiattong.pattern.behavioral.observer.guava;

/**
 * Created by Tom.
 */
public class Vo {
    private String name;

    public Vo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "name='" + name + '\'' +
                '}';
    }
}
