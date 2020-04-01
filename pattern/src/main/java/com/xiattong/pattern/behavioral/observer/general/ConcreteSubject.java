package com.xiattong.pattern.behavioral.observer.general;

import java.util.ArrayList;
import java.util.List;

//具体主题者 - 具体被观察者
public class ConcreteSubject<E> implements ISubject<E> {

    // 观察者
    private List<IObserver<E>> observers = new ArrayList<IObserver<E>>();

    @Override
    public boolean attach(IObserver<E> observer) {
        return !this.observers.contains(observer) && this.observers.add(observer);
    }

    @Override
    public boolean detach(IObserver<E> observer) {
        return this.observers.remove(observer);
    }

    @Override
    public void notify(E event) {
        for (IObserver<E> observer : this.observers) {
            observer.update(event);
        }
    }
}