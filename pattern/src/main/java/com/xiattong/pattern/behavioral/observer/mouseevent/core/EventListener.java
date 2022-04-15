package com.xiattong.pattern.behavioral.observer.mouseevent.core;

import com.xiattong.pattern.behavioral.observer.mouseevent.core.Event;

/**
 * 观察者抽象
 * Created by Tom.
 */
public interface EventListener {

    public void onClick(Event e);

    public void onMove(Event e);

}
