package com.xiattong.pattern.behavioral.observer.general;

//具体观察者
public class ConcreteObserverB<E> implements IObserver<E> {
    public void update(E event) {
        System.out.println("receive event B: " + event);
    }
}