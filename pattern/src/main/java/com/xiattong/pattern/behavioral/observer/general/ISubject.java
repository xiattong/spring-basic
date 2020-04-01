package com.xiattong.pattern.behavioral.observer.general;

//抽象主题者 - 被观察的对象
public interface ISubject<E> {

    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}