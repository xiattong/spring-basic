package com.xiattong.pattern.behavioral.observer.general;

/**
 * Created by Tom.
 */
public class Test {

    public static void main(String[] args) {
        // 被观察者
        ISubject<String> observable = new ConcreteSubject<String>();
        // 观察者
        IObserver<String> observer = new ConcreteObserver<String>();
        IObserver<String> observerB = new ConcreteObserverB<String>();
        // 注册
        observable.attach(observer);
        observable.attach(observerB);
        // 通知
        observable.notify("hello");
    }

}
